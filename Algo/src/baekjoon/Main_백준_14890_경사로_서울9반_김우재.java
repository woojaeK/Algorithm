package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_14890_경사로_서울9반_김우재 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int[][] ij = new int[N][N];
		int[][] ji = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int f = Integer.parseInt(st.nextToken());
				ij[i][j] = f;
				ji[j][i] = f;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				if (ij[i][j] == ij[i][j + 1])
					continue;
				if (Math.abs((ij[i][j] - ij[i][j + 1])) == 1) {
					if (ij[i][j] > ij[i][j + 1]) {
						
					}
					if (ij[i][j] < ij[i][j + 1]) {

					}
				}
			}
		}
	}
}
