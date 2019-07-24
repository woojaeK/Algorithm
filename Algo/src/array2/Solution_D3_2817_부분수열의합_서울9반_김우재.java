package array2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_D3_2817_부분수열의합_서울9반_김우재 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] a = new int[N];
			int count = 0;
			
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(N);
			System.out.println(K);
			System.out.println(Arrays.toString(a));
			for (int i = 0; i < (1<<a.length); i++) {
				
				int sum = 0;
				
				for (int j = 0; j < a.length; j++) {
					if((i&(1<<j))>0) {
						sum = sum+a[j];
					}
				}
				if(sum == K) {
					count++;
				}
			}
			
			System.out.println("#"+tc+" " + count);
		}
		
		
	}
}
