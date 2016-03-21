package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 323. Number of Connected Components in an Undirected Graph My Submissions
 * Question Total Accepted: 5442 Total Submissions: 12749 Difficulty: Medium
 * Given n nodes labeled from 0 to n - 1 and a list of undirected edges (each
 * edge is a pair of nodes), write a function to find the number of connected
 * components in an undirected graph.
 * 
 * Example 1: 0 3 | | 1 --- 2 4 Given n = 5 and edges = [[0, 1], [1, 2], [3,
 * 4]], return 2.
 * 
 * Example 2: 0 4 | | 1 --- 2 --- 3 Given n = 5 and edges = [[0, 1], [1, 2], [2,
 * 3], [3, 4]], return 1.
 * 
 * Note: You can assume that no duplicate edges will appear in edges. Since all
 * edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear
 * together in edges.
 * 
 * Hide Company Tags Google Hide Tags Depth-first Search Breadth-first Search
 * Graph Union Find Hide Similar Problems (M) Number of Islands (M) Graph Valid
 * Tree
 * 
 * @author founder
 * 
 */
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
	public int countComponents2(int n, int[][] edges) {
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(i, new HashSet<Integer>());
		}
		for (int[] pair : edges) {
			map.get(pair[0]).add(pair[1]);
			map.get(pair[1]).add(pair[0]);
		}
		boolean[] visited = new boolean[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				count++;
				Queue<Integer> q = new LinkedList<>();
				q.offer(i);
				while (!q.isEmpty()) {
					int size = q.size();
					for (int j = 0; j < size; j++) {
						int cur = q.poll();
						visited[cur] = true;
						for (int neighbor : map.get(cur)) {
							if (!visited[neighbor]) {
								q.offer(neighbor);
							}
						}
					}
				}
			}
		}
		return count;
	}
}
