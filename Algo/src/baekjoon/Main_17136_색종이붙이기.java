package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_17136_색종이붙이기 {

	public static int N,s1,s2,s3,s4,s5;
	public static int[][] map;
	public static boolean[][] visit;
	public static Queue<int[]> queue;
	public static int[] di = {0,-1};
	public static int[] dj = {1,0};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N =10; s1 = 5; s2 = 5; s3 = 5; s4 = 5; s5 = 5;
		
		map = new int[N][N];
		visit = new boolean[N][N];
		queue = new LinkedList<int[]>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) visit[i][j] = true;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(visit[i][j]) {
					bfs(i,j);
				}
			}
		}
	}
	public static void bfs(int i, int j) {
		visit[i][j] = false;
		queue.offer(new int[] {i,j});
		while(!queue.isEmpty()) {
			int[] curr = queue.poll();

			for (int k = 0; k < 2; k++) {
				int x = curr[0] + di[k];
				int y = curr[0] + dj[k];
				if(x>=0 && y>=0 && x <N && y<N && visit[x][y]) {
					visit[x][y] = true;
					queue.offer(new int[] {x,y});
				}
			}
			
			
		}
	}
}
