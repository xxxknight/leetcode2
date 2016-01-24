package sort;

import java.util.Arrays;

public class _274_HIndex {
	public int hIndex(int[] citations) {
		int len = citations.length;
		int[] map = new int[len + 1];
		for (int i = 0; i < len; i++) {
			if (citations[i] >= len) // 比数组长度长的都归为一类
				map[len]++;
			else
				map[citations[i]]++;
		}
		for (int i = len; i >= 1; i--) {
			if (map[i] >= i)
				return i;
			map[i - 1] += map[i];
		}
		return 0;
	}

	public int hIndex2(int[] citations) {
		int h = 0;
		if (citations.length <= 0) {
			return 0;
		}
		Arrays.sort(citations);
		for (int i = citations.length - 1; i >= 0; i--) {
			if (citations[i] >= citations.length - i) {
				h = citations.length - i;
			}
		}
		return h;

	}

}
