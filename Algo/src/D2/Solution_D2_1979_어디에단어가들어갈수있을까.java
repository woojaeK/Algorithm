package D2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D2_1979_어디에단어가들어갈수있을까 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D2_1979.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		System.out.println(T);

		for (int tc = 1; tc <= 1; tc++) {
			StringTokenizer st;
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[][] matrix = new int[N][N];
			int K = Integer.parseInt(st.nextToken());
			for (int i = 0; i < matrix.length; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < matrix.length; j++) {
					matrix[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int[] check = new int[N + N];
			ArrayList<Integer> cnt = new ArrayList<>();
			int count = 0;
			int k = 1;
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					if (matrix[i][j] == 1) {
						if (k == matrix.length) {
							cnt.add(count);
							count = 0;
							k = 1;
						} else {
							count++;
							k++;
						}
					} else {
						cnt.add(count);
						count = 0;
						k++;
					}
					System.out.println(cnt);

					if (matrix[j][i] == 1) {
						if (k == matrix.length) {
							cnt.add(count);
							count = 0;
							k = 1;
						} else {
							count++;
							k++;
						}
					} else {
						cnt.add(count);
						count = 0;
						k++;

					}

				}
			}

		}
	}
}
