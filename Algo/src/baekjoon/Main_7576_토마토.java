package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7576_토마토 {

	public static int M;
	public static int N;
	public static int[][] graph;
	public static boolean[][] visit;
	public static ArrayList<int[]> list;
	public static int count;
	public static Queue<int[]> queue;
	public static int[] di = { -1, 0, 1, 0 };
	public static int[] dj = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		graph = new int[N][M];
		visit = new boolean[N][M];
		list = new ArrayList<>();
		queue = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int sdf = Integer.parseInt(st.nextToken());
				graph[i][j] = sdf;
				if (sdf == 1) {
					list.add(new int[] { i, j });
				}
				if (sdf == -1) {
					visit[i][j] = true;
				}
			}
		}
		// 1인 좌표를 배열로 넣어서 동시에 시작하고 함수내에서는 사방향 동시에 퍼지게 하기 네개 하번에쓰기
		for (int i = 0; i < list.size(); i++) {
			queue.offer(list.get(i));
		}

		dfs();
	}

	public static void dfs() {
		int cnt = 0;
		System.out.println(queue.size());
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			if (visit[curr[0]][curr[1]] == false) {
				visit[curr[0]][curr[1]] = true;
				for (int i = 0; i < di.length; i++) {
					System.out.println(Arrays.toString(curr) + " ");
					int dx = curr[0] + di[i];
					int dy = curr[1] + dj[i];
					if (dx >= 0 && dy >= 0 && dx < N && dy < M && visit[dx][dy] == false) {
						int[] aa = { dx, dy };
						queue.offer(aa);
					}
				}
			}
			System.out.println("level : " + cnt++);
		}
	}
}
