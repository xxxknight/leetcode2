package hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _187_RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
		List<String> res = new ArrayList<String>();
		if (null == s || s.length() < 10) {
			return res;
		}
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < s.length() - 9; i++) {
			if (set.contains(s.substring(i, i + 10))
					&& !res.contains(s.substring(i, i + 10))) {
				res.add(s.substring(i, i + 10));
			} else {
				set.add(s.substring(i, i + 10));
			}
		}
		return res;
	}

}
