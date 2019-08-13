
import java.util.*;

public class Solution {
	static ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[20001];
	static int color[] = new int[20001];

	static void dfs(int x, int c) {
		color[x] = c;
		for (int i = 0; i < a[x].size(); i++) {
			int tmp = a[x].get(i);
			if (color[tmp] == 0) {
				dfs(tmp, 3 - c);
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n, m;
			n = sc.nextInt();
			m = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				a[i] = new ArrayList<Integer>();
				color[i] = 0;
			}
			for (int i = 0; i < m; i++) {
				int u, v;
				u = sc.nextInt();
				v = sc.nextInt();
				a[u].add(v);
				a[v].add(u);
			}
			for (int i = 1; i <= n; i++) {
				if (color[i] == 0)
					dfs(i, 1);
			}
			boolean check = true;
			for (int i = 1; i <= n; i++) {
				for (int k = 0; k < a[i].size(); k++) {
					int j = a[i].get(k);
					if (color[i] == color[j])
						check = false;
				}
			}
			System.out.println(check ? "YES" : "NO");
		}

	}

}
