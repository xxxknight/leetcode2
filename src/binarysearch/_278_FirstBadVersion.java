package binarysearch;

public class _278_FirstBadVersion {
	public int firstBadVersion(int n) {
		int low = 1;
		int high = n;
		int mid = 0;
		while (low < high) {
			mid = low + (high - low) / 2;
			if (!isBadVersion(mid)) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
		return low;
	}

	private boolean isBadVersion(int mid) {
		return false;
	}

}
