package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_14889_스타트와링크_서울9반_김우재{

	public static int a[], v[], r, n, N, map[][], min;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
			N = Integer.parseInt(br.readLine());

			map = new int[N][N];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			n = N;
			r = N / 2;
			v = new int[n];
			a = new int[r];
			min = Integer.MAX_VALUE;
			Comb(0, 0);
			System.out.println(min);
		
	}

	private static void Comb(int start, int count) {
		if (count == r) {
			int A = 0;
			int B = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (v[i] == 1 && v[j] == 1) {
						A += map[i][j];
					}
					if (v[i] == 0 && v[j] == 0) {
						B += map[i][j];
					}
				}
			}
			
			if(min > Math.abs(A-B)) min = Math.abs(A-B);
			return;
		}
		for (int i = start; i < n; i++) {
			if (v[i] == 0) {
				v[i] = 1;
				a[count] = i;
				Comb(i, count + 1);
				v[i] = 0;
			}
		}
	}
}
