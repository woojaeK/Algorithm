package array2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Babygin2 {
	public static final int N=6;
	public static int[] n =new int[6];
	public static int[] c;
	
	
	public static boolean solve() {
		int tri = 0;
		int run = 0;
		//
		for (int i = 0; i < c.length; i++) {
			if(c[i] >= 3) {
				c[i] = c[i] -3; tri++; i--;
			}else if(c[i]>=1 && c[i+1]>=1&&c[i+2]>=1&&i<=7) {
				c[i]--; c[i+1]--; run++; i--;
			}
		}
		if(tri + run ==2) return true;
		else return false;
	}
	public static void main(String[] arg) throws Exception {
		System.out.println(new FileInputStream("res/input_babygin.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <=T; tc++) {
			c = new int[20];
			for (int i = 0; i < N; i++) {
				n[i] =sc.nextInt();
				c[n[i]]++;
			}
			System.out.println("#"+ tc + " " + solve());
		}
		sc.close();
		
	}
}
