package array2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_D2_1959_두개의숫자열_서울9반_김우재 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();	
		
			int[] a = new int[N];
			int[] b = new int[M];
			
			for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
			for (int i = 0; i < b.length; i++) b[i] = sc.nextInt();
			
			int s =0;
			if(N > M) s =M;
			else s = N;

			int sum = 0;
			int max = -1;
			
			if(M>N) {
				for(int i=0; i <M-N+1; i++) {
					for (int j = 0; j < N; j++) {
						sum = sum + a[j] * b[j+i];
					}

					if(max<sum) {
						max = sum;
					}
					sum = 0;
				}
			}else {
				for(int i=0; i <N-M+1; i++) {
					for (int j = 0; j <M; j++) {
						sum = sum + a[j+i] * b[j];
					}
					if(max<sum) {
						max = sum;
					}
					sum = 0;
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}
