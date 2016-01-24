package hashtable;

import java.util.HashSet;

/**
 * 利用Set存储已经访问过的节点，注意及时清理Set
 * @author founder
 *
 */
public class _036_ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		if (board == null || board.length == 0 || board[0].length == 0) {
			return false;
		}
		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < board.length; i++) {
			set.clear();
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '.') {
					continue;
				} else {
					if (!set.add(board[i][j])) {
						return false;
					}
				}
			}
		}

		for (int i = 0; i < board[0].length; i++) {
			set.clear();
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] == '.') {
					continue;
				} else {
					if (!set.add(board[j][i])) {
						return false;
					}
				}
			}
		}

		for (int i = 0; i < board.length; i += 3) {
			for (int j = 0; j < board[0].length; j += 3) {
				set.clear();
				for (int k = 0; k < 3; k++) {
					for (int p = 0; p < 3; p++) {
						if (board[i + k][j + p] == '.') {
							continue;
						} else {
							if (!set.add(board[i + k][j + p])) {
								return false;
							}
						}
					}
				}
			}
		}

		return true;
	}

}
