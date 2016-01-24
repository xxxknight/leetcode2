package heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _239_SlidingWindowMaximum {
	public int[] maxSlidingWindow(int[] nums, int k) {
		int len = nums.length;
		int[] result = new int[len - k + 1];
		if (nums.length == 0)
			return new int[0];
		Queue<Integer> queue = new PriorityQueue<Integer>(nums.length,
				new Comparator<Integer>() {
					@Override
					public int compare(Integer i1, Integer i2) {
						return i2 - i1;
					}
				});

		for (int i = 0; i < k; i++) {
			queue.add(nums[i]);
		}
		result[0] = queue.peek();
		for (int i = k; i < len; i++) {
			queue.remove(nums[i - k]);
			queue.add(nums[i]);
			result[i - k + 1] = queue.peek();
		}

		return result;
	}

}
