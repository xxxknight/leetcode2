package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * ע�ⰴ�ֵ�˳��
 * 
 * @author founder
 * 
 */

public class _049_GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Arrays.sort(strs); // ���ַ��������е��ַ������ֵ�˳������
		HashMap<String, List<String>> hs = new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			char[] tmp = strs[i].toCharArray();
			Arrays.sort(tmp); // ���ַ����е��ַ������Ա����
			String temp = new String(tmp);
			if (hs.containsKey(temp)) {
				hs.get(temp).add(strs[i]);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(strs[i]); // ���ڵ�һ�������Ѿ����ַ������ֵ�˳�����У�����ֱ�Ӽ��뼴��
				hs.put(temp, list);
			}
		}
		return new ArrayList<>(hs.values());

	}

}
