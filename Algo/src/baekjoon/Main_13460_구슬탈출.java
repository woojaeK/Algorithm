package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13460_구슬탈출 {

	public static int N,M,cnt;
	public static char[][] map;
	public static int[][] visit;
	public static int[] end;
	public static int[] di = {-1,1,0,0};
	public static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		int[] R = new int[2];
		int[] B = new int[2];
		end = new int[2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String S = st.nextToken();
			for (int j = 0; j < M; j++) {
				map[i][j] = S.charAt(j);
				if(map[i][j]=='#') visit[i][j] = -1;
				if(map[i][j]=='R') R = new int[] {i,j};
				if(map[i][j]=='B') B = new int[] {i,j};
				if(map[i][j]=='O') {
					end = new int[] {i,j};
					visit[i][j]=3;
				}
			}
		}
		dfs(R,B);
	}
	
	public static void dfs(int[] r, int[] b) {
		if(r[0] == end[0]&& r[1] == end[1]) return;
		visit[r[0]][r[1]] =1;
		visit[b[0]][b[2]] =2;
		for (int i = 0; i < 4; i++) {
			int rdx = r[0] + di[i]; 
			int rdy = r[0] + dj[i]; 
			if(visit[rdx][rdy] != -1 && visit[rdx][rdy] != 2) {				
				switch (i) {
				case 0:
					for (int j = 0; j < 8; j++) {
						int bdx = b[0] + di[0];
						int bdy = b[1] + dj[0];
						if(visit[bdx][bdy+j] == -1){
							int bnext = bdy+j;
						}else {
						}
						if(visit[rdx][rdy+j] == -1 ) {
							int rnext = rdy+j;
						}else {
						}
					}
					break;
					
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				}
			}
		}
	}
}