package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1707_이분그래프 {
	public static int V;
	public static int E;
	public static boolean[] visit;
	public static ArrayList<ArrayList<Integer>> graph;
	public static Queue<Integer> queue;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int k = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= k; tc++) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			queue = new LinkedList<Integer>();
			graph = new ArrayList<ArrayList<Integer>>();
			int x = 0, y = 0;
			for (int i = 1; i <= E; i++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				graph.get(x).add(y);
				graph.get(y).add(x);
			}
			System.out.println(graph);
			int start = 0;
			label: for (int i = 0; i < graph.size(); i++) {
				for (int j = 0; j < graph.size(); j++) {
					start = i;
					break label;
				}
			}
			
			dfs(start);
			
			if (visit[0] == true)
				System.out.println("N0");
			else
				System.out.println("YES");
		}
	}

	public static void dfs(int node) {
		visit = new boolean[V + 1];
		queue.offer(node);
		while (!queue.isEmpty()) {
			int curr = queue.poll();
			if (visit[curr] == false) {
				visit[curr] = true;
				for (int i = 1; i <= V; i++) {
					if (visit[i] == false && graph.get(curr).get(i) == 1) {
						queue.offer(i);
					}
				}
			} else {
				visit[0] = true;
				return;
			}
		}
	}
}
