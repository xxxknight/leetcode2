package dfs_bfs_unionfind;

public class _261_GraphValidTree {
	public boolean validTree(int n, int[][] edges) {
		// initialize n isolated islands
		int[] roots = new int[n];

		for (int i = 0; i < roots.length; i++) {
			roots[i] = i;
		}

		// perform union find
		for (int i = 0; i < edges.length; i++) {
			int root1 = find(roots, edges[i][0]);
			int root2 = find(roots, edges[i][1]);

			// if two vertices happen to be in the same set
			// then there's a cycle
			if (root1 == root2) {
				return false;
			}

			// union
			roots[root1] = root2;
		}

		return edges.length == n - 1;
	}

	public int find(int roots[], int id) {
		while (roots[id] != id) {
			id = roots[id];
		}
		return id;
	}

}
