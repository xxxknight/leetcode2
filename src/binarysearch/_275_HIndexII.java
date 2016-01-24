package binarysearch;

public class _275_HIndexII {
	public int hIndex(int[] citations) {
		int low = 0;
		int len = citations.length;
		int high = len - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (citations[mid] >= len - mid) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return len - low;
	}

}
