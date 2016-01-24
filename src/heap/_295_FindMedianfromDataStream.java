package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _295_FindMedianfromDataStream {
	private PriorityQueue<Integer> pq1 = new PriorityQueue<>(11,
			new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o2 - o1;
				}
			});
	private PriorityQueue<Integer> pq2 = new PriorityQueue<>();

	// Adds a number into the data structure.
	public void addNum(int num) {
		if (pq1.isEmpty()) {
			pq1.add(num);
		} else if (pq1.size() > pq2.size()) {
			if (num >= pq1.peek()) {
				pq2.add(num);
			} else {
				pq2.add(pq1.poll());
				pq1.add(num);
			}
		} else {
			if (num <= pq2.peek()) {
				pq1.add(num);
			} else {
				pq1.add(pq2.poll());
				pq2.add(num);
			}
		}

	}

	// Returns the median of current data stream
	public double findMedian() {
		if (pq1.size() == pq2.size()) {
			return (pq1.peek() + pq2.peek()) / 2.0;
		} else {
			return pq1.peek();
		}
	}

}
