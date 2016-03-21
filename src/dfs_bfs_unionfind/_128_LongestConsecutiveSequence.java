package dfs_bfs_unionfind;

import java.util.LinkedList;
import java.util.Queue;

public class _128_LongestConsecutiveSequence {
	    class Pair {
			int x;
			int y;

			public Pair(int x, int y) {
				this.x = x;
				this.y = y;
			}
		}

		public void solve(char[][] board) {
			if (null == board || board.length == 0) {
				return;
			}
			int row = board.length;
			int col = board[0].length;
			if(row == 1 && col ==1){
			        return ;
			}
			Queue<Pair> queue = new LinkedList<Pair>();
			for (int i = 0; i < col - 1; i++) {
				if (board[0][i] == 'O') {
					queue.offer(new Pair(0, i));
					board[0][i] = 'P';
				}
			}
			for (int i = 0; i < row - 1; i++) {
				if (board[i][col - 1] == 'O') {
					queue.offer(new Pair(i, col - 1));
					board[i][col - 1] = 'P';
				}
			}
			for (int i = col - 1; i > 0; i--) {
				if (board[row - 1][i] == 'O') {
					queue.offer(new Pair(row - 1, i));
					board[row - 1][i] = 'P';
				}
			}
			for (int i = row - 1; i > 0; i--) {
				if (board[i][0] == 'O') {
					queue.offer(new Pair(i, 0));
					board[i][0] = 'P';
				}
			}

			while (!queue.isEmpty()) {
				Pair temp = queue.poll();
				if (isValid(row, col, temp.x + 1, temp.y)) {
					if (board[temp.x + 1][temp.y] == 'O') {
						queue.offer(new Pair(temp.x + 1, temp.y));
						board[temp.x + 1][temp.y] = 'P';
					}
				}

				if (isValid(row, col, temp.x, temp.y + 1)) {
					if (board[temp.x][temp.y + 1] == 'O') {
						queue.offer(new Pair(temp.x, temp.y + 1));
						board[temp.x][temp.y + 1] = 'P';
					}
				}

				if (isValid(row, col, temp.x - 1, temp.y)) {
					if (board[temp.x - 1][temp.y] == 'O') {
						queue.offer(new Pair(temp.x - 1, temp.y));
						board[temp.x - 1][temp.y] = 'P';
					}
				}

				if (isValid(row, col, temp.x, temp.y - 1)) {
					if (board[temp.x][temp.y - 1] == 'O') {
						queue.offer(new Pair(temp.x, temp.y - 1));
						board[temp.x][temp.y - 1] = 'P';
					}
				}
			}

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (board[i][j] == 'O') {
						board[i][j] = 'X';
					} else if (board[i][j] == 'P') {
						board[i][j] = 'O';
					}
				}
			}

		}

		public boolean isValid(int row, int col, int x, int y) {
			if (x < row && x >= 0 && y < col && y >= 0) {
				return true;
			}
			return false;
		}

}
