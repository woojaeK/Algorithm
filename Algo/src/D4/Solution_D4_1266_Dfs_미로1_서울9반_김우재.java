package D4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_D4_1266_Dfs_미로1_서울9반_김우재 {

	public static int[][] graph;
	public static int N;
	public static boolean[][] visit;
	public static int[] di = { -1, 1, 0, 0 };
	public static int[] dj = { 0, 0, -1, 1 };
	public static int cnt;
	public static Queue<int[]> queue;
	public static int[] start;
	public static int[] finish;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int tc = 1; tc <= 10; tc++) {
			N =16;
			br.readLine();
			graph = new int[N][N];
			visit = new boolean[N][N];
			queue = new LinkedList<int[]>();
			start = new int[] { 0, 0 };
			finish = new int[] { 0, 0 };
			cnt = 0;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				String S = st.nextToken();
				for (int j = 0; j < N; j++) {
					graph[i][j] = Character.getNumericValue(S.charAt(j));
					if (graph[i][j] == 1)
						visit[i][j] = true;
					if (graph[i][j] == 2) {
						start[0] = i;
						start[1] = j;
					}
					if (graph[i][j] == 3) {
						finish[0] = i;
						finish[1] = j;
					}
				}
			}
			bfs(start[0], start[1]);
			System.out.println("#" + tc + " " + cnt);
		}
	}

	public static void bfs(int x, int y) {
		visit[x][y] = true;
		int[] aa = { x, y };
		queue.offer(aa);
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			for (int i = 0; i < di.length; i++) {
				int dx = curr[0] + di[i];
				int dy = curr[1] + dj[i];
				if (dx >= 0 && dy >= 0 && dx < N && dy < N && !visit[dx][dy]) {
					if (dx == finish[0] && dy == finish[1]) {
						cnt = 1;
						return;
					}
					visit[dx][dy] = true;
					int[] bb = { dx, dy };
					queue.offer(bb);
				}
			}
		}
	}
}
