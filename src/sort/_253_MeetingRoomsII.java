package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Given an array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms
 * required.
 * 
 * For example, Given [[0, 30],[5, 10],[15, 20]], return 2.
 * 
 * Hide Company Tags Google Facebook Hide Tags Heap Greedy Sort Hide Similar
 * Problems (H) Merge Intervals (E) Meeting Rooms
 * 
 * 
 */
public class _253_MeetingRoomsII {
	public int minMeetingRooms(Interval[] intervals) {
		if (intervals == null || intervals.length == 0)
			return 0;

		// Sort the intervals by start time
		Arrays.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return a.start - b.start;
			}
		});

		// Use a min heap to track the minimum end time of merged intervals
		PriorityQueue<Interval> heap = new PriorityQueue<Interval>(
				intervals.length, new Comparator<Interval>() {
					public int compare(Interval a, Interval b) {
						return a.end - b.end;
					}
				});

		// start with the first meeting, put it to a meeting room
		heap.offer(intervals[0]);

		for (int i = 1; i < intervals.length; i++) {
			// get the meeting room that finishes earliest
			Interval interval = heap.poll();

			if (intervals[i].start >= interval.end) {
				// if the current meeting starts right after
				// there's no need for a new room, merge the interval
				interval.end = intervals[i].end;
			} else {
				// otherwise, this meeting needs a new room
				heap.offer(intervals[i]);
			}

			// don't forget to put the meeting room back
			heap.offer(interval);
		}

		return heap.size();
	}

	// //利用同一个时间段的结束时间不可能小于开始时间
	public int minMeetingRooms2(Interval[] intervals) {
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];
		for (int i = 0; i < intervals.length; i++) {
			starts[i] = intervals[i].start;
			ends[i] = intervals[i].end;
		}
		Arrays.sort(starts);
		Arrays.sort(ends);
		int rooms = 0;
		int endsItr = 0;
		for (int i = 0; i < starts.length; i++) {
			if (starts[i] < ends[endsItr])
				rooms++;
			else
				endsItr++;
		}
		return rooms;
	}

}
