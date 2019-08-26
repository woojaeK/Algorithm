package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1695_단지번호붙이기_Dfs_서울9반_김우재 {

	public static int[][] graph;
	public static int N;
	public static boolean[][] visit;
	public static int[] di = { -1, 1, 0, 0 };
	public static int[] dj = { 0, 0, -1, 1 };
	public static int cnt;
	public static ArrayList<Integer> list;
	public static Queue<int[]> queue;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		graph = new int[N][N];
		visit = new boolean[N][N];
		queue = new LinkedList<int[]>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			for (int j = 0; j < N; j++) {
				graph[i][j] = Character.getNumericValue(S.charAt(j));
				if (graph[i][j] == 0)
					visit[i][j] = true;
			}
		}
		cnt = 0;
		list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visit[i][j] == false) {
					bfs(i, j);
					list.add(cnt);
					cnt = 0;
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public static void bfs(int x, int y) {
		visit[x][y] = true;
cnt++;
		int[] aa = { x, y };
		queue.offer(aa);
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			for (int i = 0; i < di.length; i++) {
				int dx = curr[0] + di[i];
				int dy = curr[1] + dj[i];
				if (dx >= 0 && dy >= 0 && dx < N && dy < N && !visit[dx][dy]) {
					visit[dx][dy] = true;
					int[] bb = {dx,dy};
					queue.offer(bb);
					cnt++;
				}
			}
		}
	}
}
