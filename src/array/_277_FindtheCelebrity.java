package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Suppose you are at a party with n people (labeled from 0 to n - 1) and among
 * them, there may exist one celebrity. The definition of a celebrity is that
 * all the other n - 1 people know him/her but he/she does not know any of them.
 * 
 * Now you want to find out who the celebrity is or verify that there is not
 * one. The only thing you are allowed to do is to ask questions like:
 * "Hi, A. Do you know B?" to get information of whether A knows B. You need to
 * find out the celebrity (or verify there is not one) by asking as few
 * questions as possible (in the asymptotic sense).
 * 
 * You are given a helper function bool knows(a, b) which tells you whether A
 * knows B. Implement a function int findCelebrity(n), your function should
 * minimize the number of calls to knows.
 * 
 * Note: There will be exactly one celebrity if he/she is in the party. Return
 * the celebrity's label if there is a celebrity in the party. If there is no
 * celebrity, return -1.
 * 
 * Hide Company Tags LinkedIn Hide Tags Array
 * 
 */

public class _277_FindtheCelebrity {
	public int findCelebrity(int n) {
        int candidate = 0;
        for(int i = 1; i < n; i++){
            if(knows(candidate, i))
                candidate = i;
        }
        for(int i = 0; i < n; i++){
            if(i != candidate && (knows(candidate, i) || !knows(i, candidate))) return -1;
        }
        return candidate;
    }
	public int findCelebrity2(int n) {
		if (n == 0) {
			return -1;
		} else if (n == 1) {
			return 0;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		while (list.size() > 1) {
			int i = list.get(0);
			int j = list.get(1);
			if (knows(i, j)) {
				list.remove(0);
			}else {
				list.remove(1);
			}
		}
		int res = list.get(0);
		for (int i = 0; i < n; i++) {
			if ((res != i) && (knows(res, i) || !knows(i, res))) {
				return -1;
			}
		}
		return res;
	}

	private boolean knows(int i, int j) {
		return false;
	}

	public static void main(String[] args) {

	}

}
