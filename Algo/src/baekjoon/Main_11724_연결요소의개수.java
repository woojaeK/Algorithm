package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11724_연결요소의개수 {

	public static int N;
	public static int M;
	public static int[][] graph;
	public static boolean[] visit;
	public static Queue<Integer> queue;
	public static int cnt;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new int[N + 1][N + 1];
		queue = new LinkedList<Integer>();

		int x = 0, y = 0;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			graph[x][y] = 1;
			graph[y][x] = 1;
		}

		visit = new boolean[N + 1];
		for (int i = 1; i <= N; i++) {
			bfs(i);
		}
		System.out.println(cnt);
	}

	public static void bfs(int node) {
		visit[0] = true;
		if (visit[node] == false) {
			cnt++;
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
		}
	}
}
