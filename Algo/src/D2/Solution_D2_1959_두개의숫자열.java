package D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_D2_1959_두개의숫자열 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D2_1959.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= 1; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] a = new int[N];
			int[] b = new int[M];
			for (int i = 0; i < N; i++)
				a[i] = sc.nextInt();
			for (int i = 0; i < M; i++)
				b[i] = sc.nextInt();
			int sum =0;
			int max = -1;
			if (N < M) {
				for (int i = 0; i <= M-N; i++) {
					for (int j = 0; j < N; j++) {
						sum += a[j] * b[i+j];
					}	
					if(max < sum) max = sum;
					sum = 0;
				}	
			} else {
				for (int i = 0; i <= N-M; i++) {
					for (int j = 0; j < M; j++) {
						sum += a[j+i] * b[j];
					}
					if(max < sum) max = sum;
					sum =0;
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}
