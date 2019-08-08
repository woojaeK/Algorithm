package D2;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution_D2_2007_패턴마디의길이 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_d2_2007.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String S = sc.next();
			// char[] s = new char[30];
			StringBuilder sb = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();
			ArrayList<Integer> dab = new ArrayList<>();
			int jdab = 0;
			for (int j = 1; j < 10; j++) {
				if (S.charAt(0) == S.charAt(j))
					dab.add(j);
			}
			for (int i = 0; i < dab.size(); i++) {
				for (int j = 0; j < dab.get(i); j++) {
					sb.append(S.charAt(j));
					sb2.append(S.charAt(j + dab.get(i)));
				}
				if(sb.toString().equals(sb2.toString())) {
					jdab = sb.length();  break;
				}else {
					sb.setLength(0);
					sb2.setLength(0);
				}
			}

			System.out.println("#" + tc + " " + S.substring(0,jdab));
		}
	}
}
