package jungol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_정올_2097_지하철_서울9반_김우재dfs {

	public static int N, M, a[][],min;
	public static boolean v[];
	public static String way;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		a = new int[N][N];//그래프
		v = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		dfs(0, 0,"");
		
		System.out.println(min);
		System.out.println(way+M);
		
	}
	private static void dfs(int node, int dis, String path) {
		if(dis >= min) return;
		if(node == M-1) {
			if(min > dis) {
				min = dis;
				way = path;
			}
			return;
		}
		if(v[node] == false) {
			v[node] = true;
			for (int i = 0; i < N; i++) {
				if(i != node && !v[i]) {
					dfs(i, dis + a[node][i], (path+(node+1)+" "));
				}
			}
			v[node] = false;
		}
	}
}
