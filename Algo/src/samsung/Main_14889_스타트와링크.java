package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14889_스타트와링크{
	
	public static int N, map[][], min;
	public static boolean visit[];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visit = new boolean[N];
		min = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());		
			}
		}
		
		//N에서 조합으로 3개 봅기 true false 인거 각각 더해주기 전체 차를 넣어주기
		Comb(1, 0);
		System.out.println(min);
	}

	private static void Comb(int start , int count) {
		if(count == N/2) {
			int a = 0;
			int b = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(!visit[i] && !visit[j]) {
						a += map[i][j];
					}
					if(visit[i] && visit[j]) {
						b += map[i][j];
					}
				}
			}
			if(min > Math.abs(a-b)) min = Math.abs(a-b);
			return;
		}
		for (int i = start; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				Comb(i, count +1);
				visit[i] = false;
			}
		}
	}
}
