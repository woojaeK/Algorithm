package array2;

import java.util.Scanner;

public class Solution_D2_1989_초심자의회문검사_서울9반_김우재 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
				sc.nextLine();
		for (int tc = 1; tc <= T; tc++) {
			String t = sc.nextLine();
			int i =0;
			StringBuilder text = new StringBuilder(t);
			if(t.equals(text.reverse().toString())) i=1;
			System.out.println("#"+ tc + " " + i);
		}
	}
}
