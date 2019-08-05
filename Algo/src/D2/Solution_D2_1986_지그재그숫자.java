package D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_D2_1986_지그재그숫자 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D2_1986.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int dab = 1;
			for (int i = 2; i <= N; i++) {
				if(i%2 == 1) {
					dab = dab +i;
				} else {
					dab = dab-i;
				}
			}
			System.out.println("#" + tc + " " + dab);
		}
	}
}
