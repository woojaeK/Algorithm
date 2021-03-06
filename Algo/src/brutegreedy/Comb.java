package brutegreedy;

import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

//조합
public class Comb {
	public static int n, r, cnt, a[], d[] = {1,2,3,4,5};

	public static void nCr(int n, int r) {
		if(n<r) return;
		if (r == 0) {
			cnt++;
			System.out.println(Arrays.toString(a));
			return;
		}
		a[r-1] = d[n-1];
		nCr(n-1,r-1);
		nCr(n-1,r);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 5;// sc.nextInt();
		r = 3;// sc.nextInt();
		// 5개중에서 3개를뽑는경우
		a = new int[r];
		nCr(n,r);
		System.out.println(cnt);
		sc.close();
	}
}
