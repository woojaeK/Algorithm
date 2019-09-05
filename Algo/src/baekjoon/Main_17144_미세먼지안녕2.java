package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_17144_미세먼지안녕2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
 
		st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
 
		int[][] room = new int[R][C];
		int air = 0;
		for (int r = 0; r < R; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < C; c++) {
				room[r][c] = Integer.parseInt(st.nextToken());
				if (room[r][c] == -1)
					air = r;
			}
		}
		air--;
		int[] di = { -1, 1, 0, 0 };
		int[] dj = { 0, 0, -1, 1 };
		for (int t = 0; t < T; t++) {
			int[][] toom = new int[R][C];
			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					if (room[r][c] > 0) {
						int cnt = 0;
						for (int i = 0; i < 4; i++) {
							int x = r + di[i];
							int y = c + dj[i];
							if (x >= 0 && y >= 0 && x < R && y < C && room[x][y] > 0) {
								toom[x][y] += room[r][c] / 5;
								cnt++;
							}
						}
						room[r][c] -= (room[r][c] / 5) * cnt;
					}
				}
			}
			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					room[r][c] += toom[r][c]; 
				}
			}
//			for (int i = air; i < toom.length; i++) 
		}
	}
}