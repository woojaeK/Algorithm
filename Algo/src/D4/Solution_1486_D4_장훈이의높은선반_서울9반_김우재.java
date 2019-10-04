package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1486_D4_장훈이의높은선반_서울9반_김우재 {

	public static int N, B, a[], min;
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/1486_D4_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			min = Integer.MAX_VALUE;
			a= new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			dfs(0, 0 ,0);
			System.out.println("#" + tc + " " + (min-B));
	
		}
	}

	public static void dfs(int i, int sum, int cnt) {
		if(cnt == N ||( sum >= B && min > sum) ) {
			min = sum;
			return;
		}
		
		for (int j = i; j <N; j++) {
				dfs(j+1, sum+a[j] ,cnt+1);
		}
	}
}
