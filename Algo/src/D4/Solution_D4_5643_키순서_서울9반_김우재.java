package D4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D4_5643_키순서_서울9반_김우재 {

	public static int N, M, map[][];
	public static boolean visit[];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			M = Integer.parseInt(br.readLine());
			
			map = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(i!=j) map[i][j] = 9999;
				}
			}
		
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken()) -1;
				int b = Integer.parseInt(st.nextToken()) -1;
				map[a][b] = 1;
			}
			
			for (int k = 0; k < N; k++) {
				for (int i = 0; i < N; i++) {
					for (int j = 0; j < N; j++) {
						if(map[i][j] > map[i][k] + map[k][j]) {
							map[i][j] = map[i][k] + map[k][j];
						}
					}
				}
			}
			
			int[] chk = new int[N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j] != 9999 || map[j][i] != 9999) {
						chk[i]++;
					}
				}
			}
			
			int dab = 0;
			for (int i = 0; i < chk.length; i++) {
				if(chk[i] == N) dab++;
			}
				System.out.println("#" + tc + " " +dab);
		}
	}
}
