package twopointer;

/**
 * 双指针法。面积由宽度乘以小的高
 * 
 * @author founder
 * 
 */
public class _011_ContainerWithMostWater {
	public int maxArea(int[] height) {
		int len = height.length;
		if (len <= 1) {
			return 0;
		}
		int maxA = 0;
		int low = 0;
		int high = len - 1;
		while (low < high) {
			int minH = Math.min(height[low], height[high]);
			int A = minH * (high - low);
			if (A > maxA) {
				maxA = A;
			}
			if (height[low] > height[high]) {
				high--;
			} else {
				low++;
			}
		}
		return maxA;
	}

}
