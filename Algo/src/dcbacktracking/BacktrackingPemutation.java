package dcbacktracking;

import java.util.Arrays;

public class BacktrackingPemutation {
	public static int[] d = { 1, 2, 3};
	public static int cnt;

	public static void main(String[] args) {
		int[] a = new int[d.length];
		backtrack(a, 0, a.length);
		System.out.println(cnt);
	}

	public static void backtrack(int[] a, int k, int input) {
		int[] c = new int[a.length];
		if (k == input) {
			cnt++;
			System.out.println(Arrays.toString(a) + " ");
			for (int i = 0; i < input; i++) {
					System.out.print(d[a[i]] + " ");
			}
			System.out.println();
			return;
		}
		int ncands = candidate(a, k, c);
		for (int i = 0; i < ncands; i++) {
			a[k] = c[i];
			backtrack(a, k + 1, input);
		}
	}

	public static int candidate(int[] a, int k, int[] c) {
		boolean[] perm = new boolean[a.length];
		for (int i = 0; i < k; i++) perm[a[i]] = true;
		int ncands = 0;
		for (int i = 0; i < perm.length; i++) {
			if(!perm[i]) c[ncands++] = i; 
		}
		return ncands;
	}
}
