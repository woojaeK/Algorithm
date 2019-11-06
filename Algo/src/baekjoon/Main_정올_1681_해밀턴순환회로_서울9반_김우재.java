package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_정올_1681_해밀턴순환회로_서울9반_김우재 {
	
	public static int N, map[][], min;
	public static boolean visit[];

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		visit = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		min = Integer.MAX_VALUE;

		dfs(0, 0, 0);	
		
		System.out.println(min);
	}
	
	public static void dfs(int next, int sum, int count) {
		if(min < sum) return;
		if(count==N-1) {
			if(map[next][0] == 0) return;
			sum += map[next][0];
			if(min > sum) min = sum;
			return;
		}		
	
		for (int i = 1; i < N; i++) {
			if(!visit[i] && map[next][i] != 0) {
				visit[next] = true;
				dfs(i, sum+map[next][i], count+1);
				visit[next] = false;
			}
		}
	}
}
