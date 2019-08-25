import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static class Edge {
		int a;
		int b;

		Edge(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public String toString() {
			return "(" + a + "," + b + ")";
		}
	}

	public static int getParent(int[] p, int x) {
		if (p[x] == x)
			return x;
		else
			return p[x] = getParent(p, p[x]); // 최종부모의 정보를 바꿔주면서...
	}

	public static void unionParent(int[] p, int a, int b) {
		a = getParent(p, a);
		b = getParent(p, b);
		if (a < b)
			p[b] = a;
		else
			p[a] = b;
	}

	public static int findParent(int[] p, int a, int b) {
		a = getParent(p, a);
		b = getParent(p, b);
		if (a == b)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int z = 0; z < T; z++) {
			System.out.print("#" + (z + 1) + " ");
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] p = new int[n];
			for (int i = 0; i < n; i++)
				p[i] = i; // make_set;

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
//System.out.println(a+" "+b+" "+c);
				if (a == 0) {
					unionParent(p, b - 1, c - 1);
				} else {
					System.out.print(findParent(p, b - 1, c - 1));
				}
			}
			System.out.println();
		}
	}

}
