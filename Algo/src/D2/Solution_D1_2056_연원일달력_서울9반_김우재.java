package D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_D1_2056_연원일달력_서울9반_김우재 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			int[] a = new int[8];
			for (int j = 0; j < a.length; j++) {
				a[j] = Character.getNumericValue(s.charAt(j));	
			}
			int[] b = new int[3];
			b[0] = a[0]*1000 + a[1]*100 + a[2]*10 + a[3];
			b[1] = a[4]*10 + a[5];
			b[2] = a[6]*10 + a[7];
			int[] c = {1,3,5,7,8,10,12};
			int[] d = {4,6,9,11};
			int e =2;
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < s.length(); j++) {
				sb.append(s.charAt(j));	
				if(j == 3 || j == 5) sb.append("/");
			}
			if(b[1]==c[0]||b[1]==c[1]||b[1]==c[2]||b[1]==c[3]||b[1]==c[4]||b[1]==c[5]||b[1]==c[6]) {
				if(b[2] > 0 && b[2] <32) {
					System.out.println("#" + tc + " "+sb);
				}else {
					System.out.println("#" + tc + " -1");
				}
			}
			else if(b[1] == d[0] ||b[1] == d[1] ||b[1] == d[2] ||b[1] == d[3]) {
				if(b[2] > 0 && b[2] <31) {
					System.out.println("#" + tc + " "+sb);
				}else {
					System.out.println("#" + tc + " -1");
				}
			}
			else if(b[1] == e) {
				if(b[2] > 0 && b[2] <29) {
					System.out.println("#" + tc + " "+sb);
				}else {
					System.out.println("#" + tc + " -1");
				}
			}else {
				System.out.println("#" + tc + " -1");
			}
		}
	}
}
