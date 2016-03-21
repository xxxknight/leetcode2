package dfs_bfs_unionfind;

public class _323_NumberofConnectedComponentsinanUndirectedGraph {
	public int countComponents(int n, int[][] edges) {
	    int[] roots = new int[n];
	    for(int i = 0; i < n; i++) roots[i] = i; 

	    for(int[] e : edges) {
	        int root1 = find(roots, e[0]);
	        int root2 = find(roots, e[1]);
	        if(root1 != root2) {      
	            roots[root1] = root2;  // union
	            n--;
	        }else {
				roots[e[0]] = root1;
				roots[e[1]] = root1;
			}
	    }
	    return n;
	}

	public int find(int[] roots, int id) {
	    while(roots[id] != id) {
	       
	        id = roots[id];
	    }
	    return id;
	}
	

}
