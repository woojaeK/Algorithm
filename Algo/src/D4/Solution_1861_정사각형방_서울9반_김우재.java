package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1861_정사각형방_서울9반_김우재 {

	public static int N, cnt;
	public static int[][] map;
	public static boolean[][] visit;
	public static boolean check;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_1861.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());

			map = new int[N][N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int max = -1;
			int maxij = N * N;
			check = false;
			visit = new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					cnt = 0;
					dfs(i, j);
					if (check) {
						if (max < cnt) {
							max = cnt;
							maxij = map[i][j];
						} else if(max ==cnt) {
							if (maxij > map[i][j]) maxij = map[i][j];
						}
					}
					check = false;
				}
			}

			System.out.println("#" + tc + " " + maxij + " " + max);
		}
	}

	public static void dfs(int i, int j) {
		visit[i][j] = true;
		cnt++;
		int[] di = { -1, 1, 0, 0 };
		int[] dj = { 0, 0, -1, 1 };
		for (int k = 0; k < 4; k++) {
			int x = i + di[k];
			int y = j + dj[k];
			if (x >= 0 && y >= 0 && x < N && y < N && !visit[x][y] && map[i][j] + 1 == map[x][y]) {
				check = true;
				dfs(x, y);
			}
		}
		visit[i][j] = false;
	}
}
