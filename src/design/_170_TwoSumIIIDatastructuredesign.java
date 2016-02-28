package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Design and implement a TwoSum class. It should support the following
 * operations: add and find.
 * 
 * add - Add the number to an internal data structure. find - Find if there
 * exists any pair of numbers which sum is equal to the value.
 * 
 * For example, add(1); add(3); add(5); find(4) -> true find(7) -> false Hide
 * Company Tags LinkedIn Hide Tags Hash Table Design Hide Similar Problems (M)
 * Two Sum (E) Unique Word Abbreviation
 * 
 */
public class _170_TwoSumIIIDatastructuredesign {
	private HashMap<Integer, Integer> map = new HashMap<>();

	// Add the number to an internal data structure.
	public void add(int number) {
		if (map.containsKey(number)) {
			map.put(number, map.get(number) + 1);
		} else {
			map.put(number, 1);
		}
	}

	// Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
		if (map.isEmpty()) {
			return false;
		}
		Set<Integer> set = map.keySet();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer temp = iterator.next();
			if (temp == (value - temp)) {
				if (map.containsKey(value - temp) && map.get(temp) >= 2) {
					return true;
				}
			} else {
				if (map.containsKey(value - temp)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		_170_TwoSumIIIDatastructuredesign test = new _170_TwoSumIIIDatastructuredesign();
		test.add(1);
		test.add(3);
		test.add(5);
		System.out.println(test.find(4));
		System.out.println(test.find(7));
	}

}
