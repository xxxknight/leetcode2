package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A group of two or more people wants to meet and minimize the total travel
 * distance. You are given a 2D grid of values 0 or 1, where each 1 marks the
 * home of someone in the group. The distance is calculated using Manhattan
 * Distance, where distance(p1, p2) = |p2.x - p1.x| + |p2.y - p1.y|.
 * 
 * For example, given three people living at (0,0), (0,4), and (2,2):
 * 
 * 1 - 0 - 0 - 0 - 1 | | | | | 0 - 0 - 0 - 0 - 0 | | | | | 0 - 0 - 1 - 0 - 0 The
 * point (0,2) is an ideal meeting point, as the total travel distance of
 * 2+2+2=6 is minimal. So return 6.
 * 
 * Hint:
 * 
 * Try to solve it in one dimension first. How can this solution apply to the
 * two dimension case? Hide Tags Math Sort Hide Similar Problems (H) Shortest
 * Distance from All Buildings
 * 
 * 
 */
public class _296_BestMeetingPoint {
	public int minTotalDistance(int[][] grid) {
		if (null == grid || grid.length == 0) {
			return 0;
		}
		List<Integer> listX = new ArrayList<>();
		List<Integer> listY = new ArrayList<>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					listX.add(i);
					listY.add(j);
				}
			}
		}
		return getMin(listX) + getMin(listY);
	}

	public int getMin(List<Integer> list) {
		if (list.size() <= 1) {
			return 0;
		}
		Collections.sort(list);
		int cnt = 0;
		int start = 0;
		int end = list.size() - 1;
		while (start < end) {
			cnt += list.get(end) - list.get(start);
			end--;
			start++;
		}
		return cnt;

	}

	public static void main(String[] args) {

	}

}
