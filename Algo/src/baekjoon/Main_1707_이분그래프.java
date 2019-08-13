package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_1707_이분그래프 {
	public static ArrayList<Integer>[] graph = (ArrayList<Integer>[]) new ArrayList[20001];
	public static int[] color = new int[20001];

	public static void dfs(int node, int c) {
		color[node] = c;
		for (int i = 0; i < graph[node].size(); i++) {
			int tmp = graph[node].get(i);
			if (color[tmp] == 0) {
				dfs(tmp, 3 - c);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int k = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= k; tc++) {
			st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());

			for (int i = 1; i <= V; i++) {
				graph[i] = new ArrayList<Integer>();
				color[i] = 0;
			}

			for (int i = 0; i < E; i++) {
				int x, y;
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				graph[x].add(y);
				graph[y].add(x);
			}

			for (int i = 1; i <= V; i++) {
				if (color[i] == 0)
					dfs(i, 1);
			}

			boolean check = true;
			for (int i = 1; i <= V; i++) {
				for (int j = 0; j < graph[i].size(); j++) {
					int f = graph[i].get(j);
					if (color[i] == color[f]) {
						check = false;
					}
				}
			}
			System.out.println(check ? "YES" : "NO");
		}
	}

}
