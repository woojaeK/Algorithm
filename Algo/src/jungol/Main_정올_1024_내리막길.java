package jungol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_정올_1024_내리막길 {
	public static int H,W, map[][], memo[][];
	public static boolean visit[][];
	public static int[] di = {-1,0,1,0};
	public static int[] dj = {0,1,0,-1};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());
		
		map = new int[H][W];
		memo = new int[H][W];
		visit = new boolean[H][W];
		for (int i = 0; i < H; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println(dfs(0, 0));
	}

	public static int dfs(int i, int j) {
		if(i==H-1 && j ==W-1) return 1;
		if(memo[i][j] !=0 )return memo[i][j];
		if(!visit[i][j]) {
			visit[i][j] = true;
			for (int k = 0; k < 4; k++) {
				int ni = i +di[k];
				int nj = j+ dj[k];
				if(ni<0|| ni>=H ||nj<0 || nj >=W) continue;
				if(map[i][j]>map[ni][nj]) {
					memo[i][j] += dfs(ni,nj);
				}
			}
		}
		return memo[i][j];
	}
}
