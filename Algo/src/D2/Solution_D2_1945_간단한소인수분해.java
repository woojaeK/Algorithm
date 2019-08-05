package D2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_D2_1945_간단한소인수분해 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D2_1945.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int[] a = {2,3,5,7,11};
			int[] b = new int[5];
			int n = N;
			for (int i = 0; i < b.length; i++) {
				while(n%a[i] == 0) {
					b[i]++;
					n = n/a[i];
				}
			}
			System.out.println("#"+ tc + " " + b[0] + " "+ b[1] + " "+ b[2]+ " " + b[3]+ " " + b[4]);
		}
	}
}
