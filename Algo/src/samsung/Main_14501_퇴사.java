package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14501_퇴사 {

	public static int N, T[], P[], max;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		T = new int[N+1];
		P = new int[N+1];
		max = Integer.MIN_VALUE;
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		solve(1, 0);
		System.out.println(max);
	}

	private static void solve(int day, int profit) {
		if(day == N+1) {
			if(max < profit) max = profit;
			return;
		}
		if(day > N+1) return;
		solve(day+T[day], profit+P[day]);
		solve(day+1, profit);
	}
}
