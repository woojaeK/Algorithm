package D4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_4613_러시아국기같은깃발_서울9반_김우재 {

	public static int N, M;
	public static char map[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			map = new char[N][M];
			for (int i = 0; i < N; i++) {
				String s = br.readLine();
				for (int j = 0; j < M; j++) {
					map[i][j] = s.charAt(j);
				}
			}
			int min = Integer.MAX_VALUE;
			for (int i = 1; i < N; i++) {
				for (int j = 1; j < N; j++) {
					if(i+j<N) {
						int a = solve(i, i+j);
						if(min > a) min = a;						
					}
				}
			}
			System.out.println("#" + tc + " " +min);
		}
	}

	private static int solve(int bs, int rs) {
		int sum =0;
		for (int i = 0; i <bs; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] != 'W') sum++;
			}
		}
		for (int i = bs; i < rs; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] != 'B') sum++;
			}
		}
		for (int i = rs; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(map[i][j] != 'R') sum++;
			}
		}
		return sum;
	}
}
