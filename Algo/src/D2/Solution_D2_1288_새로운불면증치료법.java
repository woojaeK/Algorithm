package D2;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_D2_1288_새로운불면증치료법 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D2_1288.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= 1; tc++) {
			int N = sc.nextInt();
			ArrayList<Integer> number = new ArrayList<>();
			int n = N;
			int m = N;
			int k = 0;
			int sum = 0;
			int l = 1;
			int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

			while (true) {
				n = n * l;
				m = m * l;
				while (m > 0) {
					m = m / 10;
					k++;
				}
				System.out.println(n+ "   " + m);
				for (int i = 0; i < k; i++) {
					for (int j = 0; j < a.length; j++) {
						if (n % 10 == a[j]) {
							a[j] = 100;
							n = n / 10;
						}
					}
				}
				
				System.out.println(Arrays.toString(a));
				for (int i = 0; i < a.length; i++) {
					sum += a[i];
				}
				
				System.out.println(sum);
				if (sum == 1000) {
					System.out.println("#" + tc + " " + n*l); 
					break;
				}
				sum =0;
				n = N;
				m = N;
				l++;
			}
			
		}
	}
}
