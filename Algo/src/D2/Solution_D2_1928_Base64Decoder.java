package D2;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Base64;

public class Solution_D2_1928_Base64Decoder {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D2_1928.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 1; tc <=T; tc++) {
			String S = sc.next();
			String s = new String(Base64.getDecoder().decode(S));
			System.out.println("#"+tc+" "+s);
		}
	}

}
