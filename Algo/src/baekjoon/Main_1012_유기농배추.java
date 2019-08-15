package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1012_유기농배추 {

	public static int[][] graph;
	public static int N;
	public static int M;
	public static int cnt;
	public static int[] di = { -1, 0, 1, 0 };
	public static int[] dj = { 0, 1, 0, -1 };

	public static void bfs(int xnode, int ynode) {
		graph[xnode][ynode] =0;
		for (int i = 0; i < di.length; i++) {
			int x = xnode + di[i];
			int y = ynode + dj[i];
			if (x >= 0 && y >= 0 && x < M && y < N && graph[x][y] == 1) {// && visit[x][y] == false) {
				bfs(x, y);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			cnt = 0;

			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			graph = new int[M][N];

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				graph[from][to] = 1;
			}

			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if(graph[i][j] ==1) {
						bfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
