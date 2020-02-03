package swea;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1249_보급로 {
	public static int N, map[][], map2[][], max;
	public static boolean visit[][];
	public static int[] di = {0, 1, 0, -1};
	public static int[] dj = {1, 0, -1, 0};
	
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_swea_1249.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= 1; tc++) {
			
			N = Integer.parseInt(br.readLine());
		
			map = new int[N][N];
			map2 = new int[N][N];
			visit = new boolean[N][N];
			max = 99999;
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				for (int j = 0; j < N; j++) {
					int a = Character.getNumericValue(s.charAt(j));
					map[i][j] = a;
				}
			}
			
			//dfs를 돌다 해당 좌표의 값이랑 비교 그 값을 넣어준다 ?
			dfs(0, 0, 0);
			for (int[] string : map2) {
				System.out.println(Arrays.toString(string));
			}
			System.out.println(max);
		}
	}


	private static void dfs(int x, int y, int cnt) {
		cnt += map[x][y];
		//종료조건
		if(cnt < map2[x][y]) {
			return;
		}
		if(x == N-1&& y==N-1) if(map2[x][y] <max) max = map2[x][y];
		visit[x][y] = true;
		map2[x][y]=cnt;
		for (int i = 0; i < 4; i++) {
			int dx = x + di[i];
			int dy = y + dj[i];
			if(dx>=0 && dy>=0 && dx < N && dy < N) {
				if(!visit[dx][dy]) {
					cnt += map2[dx][dy];
					dfs(dx, dy, cnt);
				}
			}
		}
		visit[x][y] = false;

	}
}
