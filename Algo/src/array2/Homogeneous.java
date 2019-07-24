package array2;

import java.util.Arrays;
import java.util.Scanner;

//nHr = n+r-1Cr 5H3 = 5+ 3 -1C3 = 7C3 = 7P3/3! = 7*6*5/3*2*1 =35 서로 다른 n개의 대상 가운데 중복을 허락해서 r개를 뽑는 경우의 수
public class Homogeneous {
	public static int n, r, cnt, a[];
	
	public static void Homogeneous(int start, int count) {
		if(count == r ) {
			cnt ++;
			System.out.println(Arrays.toString(a));
			return;
		}
		for (int i = start; i <= n; i++) {
			a[count] = i;
			Homogeneous(i, count+1);
		}		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 5;//sc.nextInt();
		r = 3;//sc.nextInt();
		a = new int[r];
		Homogeneous(1, 0);
		System.out.println(cnt);
		sc.close();
	}

}
