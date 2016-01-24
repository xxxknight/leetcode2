package string;

/**
 * 两个数字数组的比较
 * @author founder
 *
 */
public class _165_CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int i;
		for (i = 0; i < v1.length && i < v2.length; i++) {
			if (Integer.parseInt(v1[i]) != Integer.parseInt(v2[i])) {
				return Integer.parseInt(v1[i]) > Integer.parseInt(v2[i]) ? 1
						: -1;
			}

		}

		for (; i < v1.length; i++) {
			if (Integer.parseInt(v1[i]) != 0) {
				return 1;
			}
		}

		for (; i < v2.length; i++) {
			if (Integer.parseInt(v2[i]) != 0) {
				return -1;
			}
		}

		return 0;
	}

}
