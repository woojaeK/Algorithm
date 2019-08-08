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

		for (int tc = 1; tc <= 2; tc++) {
			int N = sc.nextInt();
			char[] a = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
			int[] x = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
			String s = "";
			int n = N;
			ArrayList<Character> ch = new ArrayList<>();
			int sum = 0;
			int k =1;
			int m =N;
			int cnt =0;
			while (true) {
				
				while(m>0) {
					m =m/10;
					cnt++;
				}
				for (int i = 0; i < cnt; i++) {
					s = n + "";
					ch.add(s.charAt(i));
					for (int j = 0; j < a.length; j++) {
						if (ch.get(i).equals(a[j])) {
							x[j] = 100;
							break;
						}
					}
					
				}
				System.out.println(Arrays.toString(x));
				s = "";
				ch.clear();
				for (int j = 0; j < x.length; j++) sum += x[j];
				if (sum == 1000) break;
				sum = 0;
				k++;
				n=N;
				m=N;
				n = n * k;
				m = m * k;
				cnt=0;
			}
			System.out.println(n);
		}
	}
}
