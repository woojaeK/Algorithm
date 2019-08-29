package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_7699_수지의수지맞는여행 {

	public static int N, M, cnt, max;
	public static char[][] map;
	public static boolean[] visit;
	public static Queue<int[]> queue;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_7699.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			map = new char[N][M];
			visit = new boolean[26];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				String S = st.nextToken();
				for (int j = 0; j < M; j++) {
					map[i][j] = S.charAt(j);
				}
			}
			cnt = 0;
			max = -1;
			dfs(0, 0);
			System.out.println("#" + tc + " " +max);
		}
	}

	public static void dfs(int i, int j) {
		cnt++;
		max = Math.max(max, cnt);
		visit[map[i][j] - 'A'] = true;
		for (int k = 0; k < 4; k++) {
			int[] di = { -1, 1, 0, 0 };
			int[] dj = { 0, 0, -1, 1 };
			int dx = i + di[k];
			int dy = j + dj[k];
			if (dx >= 0 && dy >= 0 && dx < N && dy < M && !visit[map[dx][dy] - 'A']) {
				dfs(dx, dy);
			}
		}
		cnt--;
		visit[map[i][j] - 'A'] = false;
	}
}
