/*
package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_백준_17472 {
	public static int N,M,map[][], graph[][], cnt;
	public static int[] di = {-1,0,1,0};
	public static int[] dj = {};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				
			}
		}
		cnt=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] == -1) bfs(i,j,++cnt);
			}
		}
		
		graph = new int[cnt][cnt];
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt; j++) {
				if(i==j) continue;
				graph[i][j] = INF;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] != 0) {
					for (int d = 0; d < 4; d++) {
						int ni = i + di[d];
						int nj = j + dj[d];
						if(0 <= ni && ni < N && 0 <= nj && nj <M) {
							if(map[ni][nj] ==0) {
								dfs(i,j,ni,nj,d,1);
							}
						}
					}
				}
			}
		}
	}
	
	private static void dfs(int i, int j, int ci, int cj, int d, int k) {
		int ni = ci +di[d];
		int nj = cj + dj[d];
		if(0<=ni&&ni<N&&0<=nj&& nj<M) {
			if(map[ni][nj] == 0) {
				dfs(i,j,ni,nj,d,cnt+1);
			}else {
				int s = map[i][j] - 1;
				int e = map[ni][nj] - 1;
				if(cnt>=3) {
					
				}
			}
		}
	}

	public static void bfs(int i, int j, int cnt) {
		Queue<int[]> q = new LinkedList<int[]>();
		map[i][j] = cnt;
		q.offer(new int[] {i,j,cnt});
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			for (int d = 0; d < 4; d++) {
				int ni = curr[0] + di[d];
				int nj = curr[1] + dj[d];
				if(0<=ni && ni <N && 0<= nj && nj <M) {
					if(map[ni][nj]==-1) {}
				}
			}
		}
	}
}
*/