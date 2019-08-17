package brutegreedy;

import java.util.Arrays;
import java.util.Scanner;

//순열 nPr =n*(n-1)*...*(n-r+1)*(n-r) 5P3 => 5*4*3=60
// 중복 순열 nPIr =n^r 5PI3 => 5^3=125 5개중 1개선택후 다시 5개중 1개 선택 ... .XN
//조합 nCr =nPr /r! 5C3 => 5P3/3! = 5*4*3/(3*2*1) =10 
//중복 조합 nHr =(n+r-1)Cr 5H3 => (5+3-1)C3 = 7C3= 7P3/3! = 7*6*5/(3*2*1);=35
public class powerSet {
	public static int n, r, cnt, a[], v[], d[] = { 0, 1 };
// count => level
	public static char[] c = { 'A', 'B', 'C', 'D' };

// 이해가 안되면 외워버려 
	public static void powerset(int count) {// simple dfs example
		if (count == r) {
			cnt++;
			System.out.print(Arrays.toString(a));
			for (int i = 0; i < r; i++) {
				if (a[i] == 1) {
					System.out.print(c[i] + " ");
				}
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {
			a[count] = d[i];
			powerset(count + 1);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = d.length;// sc.nextInt();
		r = 4;
		v = new int[n]; // 사용된것
		a = new int[r];
		powerset(0);
		System.out.println(cnt);
		sc.close();
	}

}