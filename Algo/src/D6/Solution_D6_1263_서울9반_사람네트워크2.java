package D6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D6_1263_서울9반_사람네트워크2 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D6_1263.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());

			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if (map[i][j] == 0 && i != j)
						map[i][j] = Integer.MAX_VALUE / 2;
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
						for (int k = 0; k < N; k++) {
							if (j != k && j != i) {
								map[j][k] = Math.min(map[j][i] + map[i][k], map[j][k]);
							}
						}
				}
			}
			
			int min = Integer.MAX_VALUE;
			int[] sum = new int[N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					sum[i] += map[i][j];
				}
				if(min > sum[i]) min = sum[i];
			}
			
			System.out.println("#" + tc + " " + min);
		}
	}
}
