package sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given an array of meeting time intervals consisting of start and end times
 * [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all
 * meetings.
 * 
 * For example, Given [[0, 30],[5, 10],[15, 20]], return false.
 * 
 * Hide Company Tags Facebook Hide Tags
 * 
 * tag : lock sort easy
 * 
 */

public class _252_MeetingRooms {
	public boolean canAttendMeetings(Interval[] intervals) {
		if (intervals == null || intervals.length <= 1) {
			return true;
		}
		Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});

		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i].start < intervals[i - 1].end) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

	}

}
