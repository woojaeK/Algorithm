package brutegreedy;

import java.util.Arrays;

public class Selection2 {
	public static int n = 5;
	public static int[] a = { 64, 25, 10, 22, 11 };

	public static int minindex(int i, int j) {
		if (i == j)
			return 1;
		int min = minindex(i + 1, j);
		return a[i] < a[min] ? i : min;
	}

	public static void selection(int index) {

		if (index == n)
			return;
		int min = minindex(index, n - 1);
		if (index != min) {
			int T = a[index];
			a[index] = a[min];
			a[min] = T;
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		
	}
}
