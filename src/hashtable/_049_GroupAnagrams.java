package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 注意按字典顺序
 * 
 * @author founder
 * 
 */

public class _049_GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Arrays.sort(strs); // 将字符串数组中的字符串按字典顺序排序
		HashMap<String, List<String>> hs = new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			char[] tmp = strs[i].toCharArray();
			Arrays.sort(tmp); // 将字符串中的字符排序以便归类
			String temp = new String(tmp);
			if (hs.containsKey(temp)) {
				hs.get(temp).add(strs[i]);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(strs[i]); // 由于第一次排序已经将字符串按字典顺序排列，所以直接加入即可
				hs.put(temp, list);
			}
		}
		return new ArrayList<>(hs.values());

	}

}
