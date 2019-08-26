package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_D4_7733 {
	public static int N;
	public static int[][] map;
	public static boolean[][] visit;
	public static int[] di = { -1, 1, 0, 0 };
	public static int[] dj = { 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_7733.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			map = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if (min > map[i][j])
						min = map[i][j];
					if (max < map[i][j])
						max = map[i][j];
				}
			}
			int ans =1;
			for (int i = min; i <= max; i++) {
				int cnt = 0;
				visit = new boolean[N][N];
				for (int j = 0; j < N; j++) {
					for (int k = 0; k < N; k++) {
						if (map[j][k] > i && !visit[j][k]) {
							cnt++;
							dfs(j, k, i);
						}
					}
				}
				if(ans < cnt) ans =cnt;
			}
			System.out.println("#" + tc + " " + ans);
		}
	}

	public static void dfs(int j, int k, int d) {
		visit[j][k] = true;
			for (int i = 0; i < 4; i++) {
				int dx = j + di[i];
				int dy = k + dj[i];
				if(dx>=0 && dy>=0 && dx<N && dy< N && !visit[dx][dy] && map[dx][dy] >d) {
					visit[dx][dy] = true;
					dfs(dx,dy,d);
				}
		}
	}
}
