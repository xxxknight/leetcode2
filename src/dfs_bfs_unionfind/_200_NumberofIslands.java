package dfs_bfs_unionfind;

public class _200_NumberofIslands {
	public int numIslands2(char[][] grid) {
		if (grid == null || grid.length <= 0 || grid[0].length <= 0) {
			return 0;
		}
		int cnt = 0;
		int row = grid.length;
		int col = grid[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (grid[i][j] == '1') {
					dfs(grid, i, j);
					cnt++;
				}
			}
		}
		return cnt;
	}

	public void dfs(char[][] grid, int i, int j) {
		if (i >= 0 && i <= grid.length - 1 && j >= 0 && j <= grid[0].length - 1
				&& grid[i][j] == '1') {
			grid[i][j] = '0';
			dfs(grid, i + 1, j);
			dfs(grid, i - 1, j);
			dfs(grid, i, j + 1);
			dfs(grid, i, j - 1);
		}
	}

	public int numIslands(char[][] grid) {
		if (grid.length == 0 || grid[0].length == 0)
			return 0;
		int m = grid.length, n = grid[0].length;
		int[] roots = new int[m * n];
		for (int i = 0; i < roots.length; i++) {
			roots[i] = i;
		}

		int cnt = 0;
		int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					cnt++;
					for (int[] dir : dirs) {
						int newX = i + dir[0];
						int newY = j + dir[1];
						if (newX >= 0 && newY >= 0 && newX < m && newY < n
								&& grid[newX][newY] == '1') {
							int root1 = find(roots, i * n + j);
							int root2 = find(roots, newX * n + newY);
							if (root1 != root2) {
								cnt--;
							}
							roots[root1] = root2;
						}
					}
				}

			}
		}
		return cnt;
	}

	public int find(int[] roots, int id) {
		while (roots[id] != id) {
			id = roots[id];
		}
		return id;
	}

	public static void main(String[] args) {
		System.out.println(new _200_NumberofIslands()
				.numIslands(new char[][] { { '1', '0' } }));
	}

}
