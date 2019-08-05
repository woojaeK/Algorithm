package D2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_D2_1288_새로운불면증치료법 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D2_1288.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= 1; tc++) {
			int N = sc.nextInt();
			String[] a = {"0","0","0","0","0","0","0","0","0"};
			int n = N;
			int k = 1;
			
			label : while (true) {
				n = n * k;
				for (int i = 0; i < a.length; i++) {
					if (n % 10 == i+1) a[i] ="a";
				}
				k++;
				if(!Arrays.asList(a).contains("0")) break label; 
			}
			System.out.println("#" + tc + " " + n);
		}
	}
}
