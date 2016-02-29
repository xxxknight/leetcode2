package design;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given two 1d vectors, implement an iterator to return their elements
 * alternately.
 * 
 * For example, given two 1d vectors:
 * 
 * v1 = [1, 2] v2 = [3, 4, 5, 6] By calling next repeatedly until hasNext
 * returns false, the order of elements returned by next should be: [1, 3, 2, 4,
 * 5, 6].
 * 
 * Follow up: What if you are given k 1d vectors? How well can your code be
 * extended to such cases?
 * 
 * Clarification for the follow up question - Update (2015-09-18): The "Zigzag"
 * order is not clearly defined and is ambiguous for k > 2 cases. If "Zigzag"
 * does not look right to you, replace "Zigzag" with "Cyclic". For example,
 * given the following input:
 * 
 * [1,2,3] [4,5,6,7] [8,9] It should return [1,4,8,2,5,9,3,6,7].
 * 
 * 
 */

public class _281_ZigzagIterator {
	private Queue<Integer> queue; 

	public _281_ZigzagIterator(List<Integer> v1, List<Integer> v2) {
		queue = new LinkedList<Integer>();
		int i = 0;
		int minLen = Math.min(v1.size(), v2.size());
		while (i < minLen) {
			queue.add(v1.get(i));
			queue.add(v2.get(i));
			i++;
		}
		while (i < v1.size()) {
			queue.add(v1.get(i));
			i++;
		}
		while (i < v2.size()) {
			queue.add(v2.get(i));
			i++;
		}
	}

	public int next() {
		return queue.poll();
	}

	public boolean hasNext() {
		return !queue.isEmpty();
	}

}
