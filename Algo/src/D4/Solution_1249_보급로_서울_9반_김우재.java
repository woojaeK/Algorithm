package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_1249_보급로_서울_9반_김우재 {
	static class Point implements Comparator<Point>{
		int a;
		int b;
		int c;
		int d;
		@Override
		public int compare(Point o1, Point o2) {
			int result = Integer.compare(o1.a,o2.a);
			if(result == 0) {
				result = Integer.compare(o1.b, o2.b);
			}
			return result;
		}
		
	}
	public static int N, map[][], min, deepth;
	public static int visit[][];
	public static Queue<int[]> q;
	public static int[] di = { -1, 0, 1, 0 };
	public static int[] dj = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_1249.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= 10; tc++) {
			N = Integer.parseInt(br.readLine());

			map = new int[N][N];
			visit = new int[N][N];
			String st = "";
			q = new LinkedList<int[]>();

			for (int i = 0; i < N; i++) {
				st = br.readLine();
				for (int j = 0; j < N; j++) {
					map[i][j] = Character.getNumericValue(st.charAt(j));
				}
			}
			
			min = Integer.MAX_VALUE;
			deepth = 0;
			bfs(0, 0);

			StringBuilder sb = new StringBuilder();
			sb.append("#");
			sb.append(tc + " ");
			sb.append(min);
			System.out.println(sb);
		}
	}

	public static void bfs(int i, int j) {
		q.offer(new int[] { i, j, map[i][j] });
		while (!q.isEmpty()) {
			int[] curr = q.poll();
			visit[i][j] = curr[2];
			if (curr[0] == N - 1 && curr[1] == N - 1) {
				if (min > curr[2])
					min = curr[2];
			}
			for (int k = 0; k < 4; k++) {
				int x = curr[0] + di[k];
				int y = curr[1] + dj[k];

				if (x >= 0 && y >= 0 && x < N && y < N) {
					q.offer(new int[] { x, y, curr[2] + map[x][y] });
				}
			}
		}
	}
}
