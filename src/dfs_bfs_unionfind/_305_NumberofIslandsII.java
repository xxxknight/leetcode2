package dfs_bfs_unionfind;

import java.util.ArrayList;
import java.util.List;


/**
 * 305. Number of Islands II My Submissions Question
Total Accepted: 4768 Total Submissions: 14210 Difficulty: Hard
A 2d grid map of m rows and n columns is initially filled with water. We may perform an addLand operation which turns the water at position (row, col) into a land. Given a list of positions to operate, count the number of islands after each addLand operation. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example:

Given m = 3, n = 3, positions = [[0,0], [0,1], [1,2], [2,1]].
Initially, the 2d grid grid is filled with water. (Assume 0 represents water and 1 represents land).

0 0 0
0 0 0
0 0 0
Operation #1: addLand(0, 0) turns the water at grid[0][0] into a land.

1 0 0
0 0 0   Number of islands = 1
0 0 0
Operation #2: addLand(0, 1) turns the water at grid[0][1] into a land.

1 1 0
0 0 0   Number of islands = 1
0 0 0
Operation #3: addLand(1, 2) turns the water at grid[1][2] into a land.

1 1 0
0 0 1   Number of islands = 2
0 0 0
Operation #4: addLand(2, 1) turns the water at grid[2][1] into a land.

1 1 0
0 0 1   Number of islands = 3
0 1 0
We return the result as an array: [1, 1, 2, 3]

Challenge:

Can you do it in time complexity O(k log mn), where k is the length of the positions?

Hide Company Tags Google
Hide Tags Union Find
Hide Similar Problems (M) Number of Islands

 * @author founder
 *
 */

public class _305_NumberofIslandsII {
	public List<Integer> numIslands2(int m, int n, int[][] positions) {
		List<Integer> res = new ArrayList<>();
		if (m <= 0 || n <= 0) {
			return res;
		}
		int cnt = 0;
		int[] roots = new int[m * n];
		for (int i = 0; i < m * n; i++) {
			roots[i] = -1;
		}

		int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

		for (int[] position : positions) {
			roots[position[0] * n + position[1]] = position[0] * n + position[1];
			cnt++;
			for (int[] dir : dirs) {
				int newX = position[0] + dir[0];
				int newY = position[1] + dir[1];
				if (newX >= 0 && newY >= 0 && newX <= m - 1 && newY <= n - 1 && roots[newX * n + newY] != -1) {
					int root1 = find(roots, position[0] * n + position[1]);
					int root2 = find(roots, newX * n + newY);
					if (root1 != root2) {
						cnt--;
					}
					roots[root1] = root2;
				}

			}
			res.add(cnt);

		}
		return res;

	}

	public int find(int[] roots, int id) {
		while (roots[id] != id) {
			id = roots[id];
		}
		return id;
	}

	public static void main(String[] args) {
		int[][] arr = { { 0, 0 }, { 0, 1 }, { 1, 2 }, { 2, 1 } };
		int m = 3;
		int n = 3;
		System.out.println(new _305_NumberofIslandsII().numIslands2(m, n, arr));
	}

}
