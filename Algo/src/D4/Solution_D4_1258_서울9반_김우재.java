package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_D4_1258_서울9반_김우재 {

	public static int N;
	public static int[][] map;
	public static boolean[][] visit;
	public static int[] di = { -1, 1, 0, 0 };
	public static int[] dj = { 0, 0, -1, 1 };
	public static Queue<int[]> queue;
	public static Queue<int[]> list;
	public static int[] curr;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_1258.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			N = Integer.parseInt(br.readLine());

			map = new int[N][N];
			visit = new boolean[N][N];
			queue = new LinkedList<>();
			list = new LinkedList<>();
			curr = new int[2];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					int a = Integer.parseInt(st.nextToken());
					map[i][j] = a;
					if (a == 0)
						visit[i][j] = true;
				}
			}
			int cnt = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visit[i][j]) {
						list.add(new int[] { i, j });
						bfs(i, j);
						cnt++;
					}
				}
			}

			ArrayList<int[]> f = new ArrayList<>();
			int u = list.size();
			for (int i = 0; i < u / 2; i++) {
				int[] a = list.poll();
				int[] b = list.poll();
				int c = b[0] - a[0] + 1;
				int d = b[1] - a[1] + 1;
				f.add(new int[] { c * d, (c), (d) });
			}

			Collections.sort(f, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[0] == o2[0]) {
						return Integer.compare(o1[1], o2[1]);
					} else {
						return Integer.compare(o1[0], o2[0]);
					}
				}
			});
			System.out.print("#" + tc + " " + cnt);
			for (int i = 0; i < f.size(); i++) {
				System.out.print(" " + f.get(i)[1] + " " + f.get(i)[2]);
			}
			System.out.println();
		}
	}

	private static void bfs(int i, int j) {
		visit[i][j] = true;
		queue.offer(new int[] { i, j });
		while (!queue.isEmpty()) {
			curr = queue.poll();
			for (int k = 0; k < 4; k++) {
				int x = curr[0] + di[k];
				int y = curr[1] + dj[k];
				if (x >= 0 && y >= 0 && x < N && y < N && !visit[x][y]) {
					visit[x][y] = true;
					queue.offer(new int[] { x, y });
				}
			}
		}
		list.add(new int[] { curr[0], curr[1] });
	}
}
