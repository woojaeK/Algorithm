package brutegreedy;

import java.util.Arrays;
import java.util.Scanner;

public class PowerSet2 {
	public static int n, cnt, v[], d[] = { 1, 2, 3, 4 };

	public static void PowerSet2(int count) {
		if (count == n) {
			cnt++;
			System.out.println(Arrays.toString(v));
			for (int i = 0; i < n; i++) {
				if (v[i] == 1)
					System.out.print(d[i] + " ");
			}
			System.out.println();
			return;
		}
		v[count] = 0;
		PowerSet2(count + 1);
		v[count] = 1;
		PowerSet2(count + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 4;// sc.nextInt();
		v = new int[n];
		PowerSet2(0);
		System.out.println(cnt);
		sc.close();
	}
}