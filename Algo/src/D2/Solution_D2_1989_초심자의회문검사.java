package D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_D2_1989_초심자의회문검사 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D2_1989.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			int dab = 1;
			for (int i = 1; i <= s.length()/2; i++) {
				if(s.charAt(i-1) != s.charAt(s.length()-i)) dab =0; break;
			}
			System.out.println("#" + tc + " " + dab);
		}
	}
}
