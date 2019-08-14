package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1012_유기농배추 {

	public static pair[] edge;
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

		for (int tc = 1; tc <= T; tc++) {
			cnt = 0;

			// 현재점이랑 이동점이랑 더햇을떄 2이면 ? 여튼 다시풀기
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			visit = new boolean[2500];
			
			edge = new pa/\
					[K];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				graph[x][y] = 1;
				graph[y][x] = 1;
			}

			for (int i = 0; i < N; i++) {
				if (visit[i] == false)
					bfs(i);
			}

			System.out.println(cnt);
		}
	}

	public static class pair{
		int from;
		int to;
		
		public pair(int from, int to) {
			this.from  = from;
			this.to = to;
		}
	}
	public static void bfs(int node) {
		queue.offer(node);
		while (!queue.isEmpty()) {
			int curr = queue.poll();
			if (visit[curr] == false) {
				
				for (int next = 0; next < N; next++) {
					if(visit[next]==false && graph[curr][next]==1) {
						visit[curr] = true;// 자기자신도 방문할수 있게 고려 다시생각
						queue.offer(next);
					}
				}
			}
		}
	}
}
