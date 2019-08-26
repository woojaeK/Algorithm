<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static int[][] graph;
	public static boolean[][] visit;
	public static int dab;
	public static int N, M;
	public static Queue<int[]> queue;
	public static ArrayList<Integer> list;
	public static int[] di = { -1, 1, 0, 0 };
	public static int[] dj = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		dab = 1;
		graph = new int[N][M];
		visit = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			for (int j = 0; j < M; j++) {
				graph[i][j] = Character.getNumericValue(S.charAt(j));
				if (graph[i][j] == 0)
					visit[i][j] = true;
			}
		}
		queue = new LinkedList<int[]>();
		dfs(0, 0);
		queue.clear();
	}
	public static void dfs(int i, int j) {
		int[] aa = { i, j };
		int distance[][] = new int[N][M];
		queue.offer(aa);
		distance[0][0]= 1;
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			for (int next = 0; next < di.length; next++) {
				int dx = curr[0] + di[next];
				int dy = curr[1] + dj[next];
				if (dx >= 0 && dy >= 0 && dx < N && dy < M && !visit[dx][dy]) {
					visit[dx][curr[1]] = true;
					int[] bb = { dx, dy };
					queue.offer(bb);
					distance[dx][dy] = distance[curr[0]][curr[1]]+1;
				}
			}
		}
		System.out.println(distance[N-1][M-1]);
	}
}
=======
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
>>>>>>> branch 'master' of https://lab.ssafy.com/woojae/work_algo.git
