package D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_D2_1948_날짜계산기 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D2_1948.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			int[] a = new int[2];
			int[] b = new int[2];
			int dab = 0;
			int k =0;
			int[] m = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
			for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
			for (int i = 0; i < b.length; i++) b[i] = sc.nextInt();
			for (int i = 1; i < m.length; i++) {
				if(a[0] == i) {
					k = a[0];
					if(a[0] == b[0]) dab = b[1] - a[1] + 1;
					else {
						dab = m[i] - a[1]+1 + b[1];
						while(k < (b[0]-1)) {
							k++;
							dab += m[k];
						}
					}
				}
			}			
			System.out.println("#" + tc + " " + dab);
		}
	}
}
