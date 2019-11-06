package samsung;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D9_2105_디저트카페_서울9반_김우재 {

	public static int N, map[][], dessert[], max;
	public static boolean visit[][];
	public static int[] di = { 1, 1, -1, -1 };
	public static int[] dj = { -1, 1, 1, -1 };

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_2105.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			N = Integer.parseInt(br.readLine());

			map = new int[N][N];
			visit = new boolean[N][N];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			max = -1;
			dessert = new int[101];
			for (int i = 0; i < N - 1; i++) {
				for (int j = 1; j < N - 1; j++) {
					dfs(i, j, 0, 0, i, j);
				}
			}
			
			System.out.println("#" + tc + " " + max);
		}
	}

	private static void dfs(int x, int y, int dir, int count, int endx, int endy) {
		if(x == endx && y == endy && count != 0) {
			if(max < count) max = count;
			return;
		}
		if(dir > 3) return;
		int dx = x + di[dir];
		int dy = y + dj[dir];
		if(dx >=0 && dy >= 0 && dx < N && dy < N) {
			int ee = map[dx][dy];
			if(dessert[ee] == 0) {
				dessert[ee] = 1;
				dfs(dx,dy,dir, count+1, endx, endy);
				dfs(dx,dy,dir+1, count+1, endx, endy);
				dessert[ee] = 0;
			}
		}
	}
}
