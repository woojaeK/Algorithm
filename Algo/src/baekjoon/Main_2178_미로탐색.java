package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2178_미로탐색{
	public static int[][] graph;
	public static boolean[][] visit;
	public static int dab;
	public static int N, M;
	public static Queue<int[]> queue;
	public static ArrayList<Integer> list;
	public static int[] di = { -1, 1, 0, 0 };
	public static int[] dj = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		dab = 1;
		graph = new int[N][M];
		visit = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			for (int j = 0; j < M; j++) {
				graph[i][j] = Character.getNumericValue(S.charAt(j));
				if (graph[i][j] == 0)
					visit[i][j] = true;
			}
		}
		queue = new LinkedList<int[]>();
		dfs(0, 0);

	}
	public static void dfs(int i, int j) {
		int[] aa = { i, j };
		int distance[][] = new int[N][M];
		queue.offer(aa);
		distance[0][0]= 1;
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			for (int next = 0; next < di.length; next++) {
				int dx = curr[0] + di[next];
				int dy = curr[1] + dj[next];
				if (dx >= 0 && dy >= 0 && dx < N && dy < M && !visit[dx][dy]) {
					visit[dx][dy] = true;
					int[] bb = { dx, dy };
					queue.offer(bb);
					distance[dx][dy] = distance[curr[0]][curr[1]]+1;
				}
			}
		}
		System.out.println(distance[N-1][M-1]);
	}
}
