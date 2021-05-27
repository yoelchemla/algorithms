package src;
import java.util.ArrayList;
import java.util.PriorityQueue;


public class Dijkstra {

	public static ArrayList<ArrayList<Integer>> InitGraph(){

		ArrayList<ArrayList<Integer>> G = new ArrayList<ArrayList<Integer>>();
		int numOfVertex = 5;

		for(int i=0; i<numOfVertex; i++) {
			G.add(new ArrayList<Integer>());
		}
		G.get(0).add(1);
		G.get(0).add(2);

		G.get(1).add(0);
		G.get(1).add(3);
		G.get(1).add(4);

		G.get(2).add(0);
		G.get(2).add(4);

		G.get(3).add(1);
		G.get(3).add(2);
		G.get(3).add(4);

		G.get(4).add(3);
		G.get(4).add(1);

		return G;
	}
	private static void dijkstraAlgo(ArrayList<ArrayList<Integer>> G, int [][]matrix, int a, int b ) {
		int n = G.size();

		int[] prev = new int[n];
		int[] distance = new int[n];
		boolean[] visited = new boolean[n];

		for(int i=0; i<n; i++) {
			prev[i] = -1;
			distance[i] = Integer.MAX_VALUE;
			visited[i] = false;			
		}

		PriorityQueue <Integer> q = new PriorityQueue<Integer>();
		q.add(a);
		distance[a] = 0;

		while(!q.isEmpty()) {
			int u = q.poll();
			for(int v : G.get(u)) {
				if( (distance[v] > distance[u] + matrix[u][v]) && visited[v] == false) { // didnt visit and difference is big
					q.add(v);
					distance[v] = distance[u] + matrix[u][v];
					prev[v] = u;
				}
			}

			visited[u] = true;
			if(u == b) {
				break;
			}
		}

		int y = b;
		String path = Integer.toString(y);
		while(prev[y] != -1) {
			y = prev[y];
			path = y + "--->" + path;
		}

		System.out.println(path);
	}
	public static void main(String[] args) {
		int[][] mat = {{0 ,1 ,2 ,1000000 ,1000000 ,1000000 ,1000000 ,1000000 },
				{1 ,0 ,4 ,1000000 ,5 ,1000000 ,1000000 ,1000000 },
				{2 ,4 ,0 ,7 ,1000000 ,3 ,1000000 ,1000000 },
				{1000000 ,1000000 ,7 ,0 ,3 ,8 ,1000000 ,1000000 },
				{1000000 ,5 ,1000000 ,3 ,0 ,1000000 ,1 ,4 }};
	
		ArrayList<ArrayList<Integer>> G = InitGraph();
		dijkstraAlgo(G, mat, 0, 4);

	}
}