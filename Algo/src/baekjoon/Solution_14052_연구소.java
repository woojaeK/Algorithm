package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_14052_연구소 {

	public static int N;
	public static int M;
	public static int[][] map;
	public static int[] visit;
	public static Queue<int[]> queue;
	public static boolean[][] mvisit;
	public static int[] di = {-1,1,0,0};
	public static int[] dj = {0,0,-1,1};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		mvisit = new boolean[N][M]; 
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) mvisit[i][j] = true;
				if(map[i][j] == 2) queue.offer(new int[] {i,j});
			}
		}
		
		
	}
}
