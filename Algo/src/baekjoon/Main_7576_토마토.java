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
<<<<<<< HEAD
	public static Queue<int[]> queue;
	public static int[] di = { -1, 0, 1, 0 };
	public static int[] dj = { 0, 1, 0, -1 };
	public static int day;
=======
	public static int count;
	public static Queue<int[]> queue;
	public static int[] di = { -1, 0, 1, 0 };
	public static int[] dj = { 0, 1, 0, -1 };
>>>>>>> branch 'master' of https://lab.ssafy.com/woojae/work_algo.git

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
<<<<<<< HEAD
		int[] aaaa = { 0, 0};
=======

>>>>>>> branch 'master' of https://lab.ssafy.com/woojae/work_algo.git
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int sdf = Integer.parseInt(st.nextToken());
				graph[i][j] = sdf;
				if (sdf == 1) {
					list.add(new int[] { i, j });
<<<<<<< HEAD
					visit[i][j] = true;
					aaaa[0]++;
				}
				if (sdf == -1) {
					visit[i][j] = true;
					aaaa[1]++;
=======
				}
				if (sdf == -1) {
					visit[i][j] = true;
>>>>>>> branch 'master' of https://lab.ssafy.com/woojae/work_algo.git
				}
			}
		}
		// 1인 좌표를 배열로 넣어서 동시에 시작하고 함수내에서는 사방향 동시에 퍼지게 하기 네개 하번에쓰기
		for (int i = 0; i < list.size(); i++) {
			queue.offer(list.get(i));
		}
<<<<<<< HEAD
		dfs();
		boolean dab = false;

		label: for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (visit[i][j] == false) {
					dab = true;
					break label;
				}
			}
		}
		if (dab)
			System.out.println(-1);
		else if (aaaa[1] == N * M || aaaa[0] == N * M)
			System.out.println(0);
		else
			System.out.println(day - 1);
=======

		dfs();
>>>>>>> branch 'master' of https://lab.ssafy.com/woojae/work_algo.git
	}

	public static void dfs() {
<<<<<<< HEAD
		day = 0;
=======
		int cnt = 0;
		System.out.println(queue.size());
>>>>>>> branch 'master' of https://lab.ssafy.com/woojae/work_algo.git
		while (!queue.isEmpty()) {
<<<<<<< HEAD
			int size = queue.size();
			for (int j = 0; j < size; j++) {
				int[] curr = queue.poll();
				for (int i = 0; i < di.length; i++) {
					int dx = curr[0] + di[i];
					int dy = curr[1] + dj[i];
					if (dx >= 0 && dy >= 0 && dx < N && dy < M && visit[dx][dy] == false) {
						visit[dx][dy] = true;
=======
			int[] curr = queue.poll();
			if (visit[curr[0]][curr[1]] == false) {
				visit[curr[0]][curr[1]] = true;
				for (int i = 0; i < di.length; i++) {
					System.out.println(Arrays.toString(curr) + " ");
					int dx = curr[0] + di[i];
					int dy = curr[1] + dj[i];
					if (dx >= 0 && dy >= 0 && dx < N && dy < M && visit[dx][dy] == false) {
>>>>>>> branch 'master' of https://lab.ssafy.com/woojae/work_algo.git
						int[] aa = { dx, dy };
						queue.offer(aa);
					}
				}
			}
<<<<<<< HEAD
			day++;
=======
			System.out.println("level : " + cnt++);
>>>>>>> branch 'master' of https://lab.ssafy.com/woojae/work_algo.git
		}
	}
}
