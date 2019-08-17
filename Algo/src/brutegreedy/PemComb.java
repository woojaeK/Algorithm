package brutegreedy;

import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class PemComb {
	public static int n, r, cnt, a[], d[] = {0,1};
	public static char[] c = {'A','B','C','D'};

	public static void permcomb(int count) {
		if (count == r) {
			cnt++;
			System.out.println(Arrays.toString(a));
			for(int i =0; i < r; i++) {
				if(a[i] == 1)System.out.println(c[i]+" ");
			}
			System.out.println();
			return;
		}
			a[count] = d[0];
			permcomb(count+1);
			a[count] = d[1];
			permcomb(count+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 2;// sc.nextInt();
		r = 4;// sc.nextInt();
		a = new int[r];
		permcomb(0);
		System.out.println(cnt);
		sc.close();
	}
}
