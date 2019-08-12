package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_10451_순열사이클 {

	public static int N;
	public static int[][] graph;
	public static boolean[] visit;
	public static Queue<Integer> queue;
	public static int cnt;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		queue = new LinkedList<Integer>();
		for (int tc = 0; tc < T; tc++) {
			cnt = 0;
			N = Integer.parseInt(br.readLine());
			graph = new int[N + 1][N + 1];
			int y = 0;
			st = new StringTokenizer(br.readLine());
			visit = new boolean[N + 1];
			for (int i = 1; i <= N; i++) {
				y = Integer.parseInt(st.nextToken());
					graph[i][y] = 1;
					graph[y][i] = 1;
			}
			for (int i = 1; i <= N; i++) {
				if (visit[i] == false) 
				bfs(i);
			}

			System.out.println(cnt);
		}
	}

	public static void bfs(int node) {
		queue.offer(node);
			while (!queue.isEmpty()) {
				int curr = queue.poll();
				if (visit[curr] == false) {
					visit[curr] = true;
					for (int next = 1; next <= N; next++) {
						if (visit[next] == false && graph[curr][next] == 1) {
							queue.offer(next);
						}
					}
				}
			}
			cnt++;
	}
}
