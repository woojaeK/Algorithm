package stack1;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution_D4_1219_길찾기_서울9반_김우재 {

	static boolean[] visit;
	static int V = 100;
	static int[][] graph;
	static int k = 0;

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/input_d4_1219.txt"));

		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			int E = sc.nextInt();
			graph = new int[V][V];

			for (int i = 0; i < E; i++) {
				int v1 = sc.nextInt();
				int v2 = sc.nextInt();
				graph[v1][v2] = 1;
			}

			// System.out.println(Arrays.deepToString(graph));
			visit = new boolean[V];
			dfs(0);
			System.out.println("#" + tc + " " + k);
			k=0;
		}
	}

	public static void dfs(int node) {
		visit[node] = true;
		// System.out.println(node + " ");
		for (int next = 0; next < V; next++) {
			if (visit[next] == false && graph[node][next] == 1) {
				dfs(next);
			}
		}	
		if(node == 99) k =1;
	}
}