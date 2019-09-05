package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_17144_미세먼지안녕 {
	public static int R,C,T;
	public static int[][] room;
	public static boolean[][] visit;
	public static int[] di = {-1,1,0,0};
	public static int[] dj = {0,0,-1,1};

 	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		
		room = new int[R][C];
		int air = 0;
		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < C; j++) {
				room[i][j] = Integer.parseInt(st.nextToken());
				if(room[i][j] == -1) air = i;
			}
		}
		air--;
		for (int k = 0; k < T; k++) {
			int [][] toom = new int[R][C];
			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					if(room[r][c] != 0 && room[r][c] != -1) {
						int cnt = 0;
						for (int d = 0; d < 4; d++) {
							int nr = r + di[d];
							int nc = c + dj[d];
							if(0<= nr && nr <R && 0<=nc&&nc<C && room[nr][nc] != -1) {
								cnt++;
								toom[nc][nr] += room[r][c]/5;
							}
						}
						room[r][c] -=(room[r][c]/5)*cnt;
					}
				}
			}
			//합산 - 계산된 이동 먼지 양 합산
			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					room[r][c] += toom[r][c];
				}
			}
			//순환 - 삭제되는 부분 부터 제거해야 다른 항이 소실되지 않음
			for (int i = air-1; i>=1; i--) room[i][0] = room[i-1][0]; //위쪽방향 위 -> 아래
			for (int i = 0; i<C-1; i++) room[0][i] = room[0][i+1];//위쪽방향 우 -> 좌
			for (int i = 0; i<air; i++) room[i][C-1] = room[i+1][C-1]; //위쪽방향 아래 -> 위
			for (int i = C-1; i>=1; i--) room[air][i] = room[air][i-1];//위쪽방향 좌-> 우

			room[air][1] = 0;
			for (int i = air+2; i<R-1; i++) room[i][0] = room[i+1][0]; //위쪽방향 위 -> 아래
			for (int i = 0; i<C-1; i++) room[R-1][i] = room[R-1][i+1];//위쪽방향 우 -> 좌
			for (int i = R-1; i>air+1; i--) room[i][C-1] = room[i-1][C-1]; //위쪽방향 아래 -> 위
			for (int i = C-1; i>=1; i--) room[air+1][i] = room[air+1][i-1];//위쪽방향 좌-> 우
			room[air+1][1] =0;
		}
		int sum =2;
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				sum += room[r][c];
			}
		}
		System.out.println(sum);
	}
}