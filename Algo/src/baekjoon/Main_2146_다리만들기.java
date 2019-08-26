package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2146_다리만들기 {

	public static int[][] map;
	public static boolean[][] visit;
	public static int[][] dis;
	public static int N;
	public static int[] di = { -1, 1, 0, 0 };
	public static int[] dj = { 0, 0, -1, 1 };
	public static Queue<int[]> queue;
	public static ArrayList<Integer> list;
	public static int number;
	public static int min = 10000;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		number = 1;
		map = new int[N][N];
		visit = new boolean[N][N];
		dis = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 0) {
					dis[i][j] = 1;
					visit[i][j] = true;
				}
			}
		}
		queue = new LinkedList<>();
		list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visit[i][j]) {
					bfs(i, j);
					number++;
				}
			}
		}
		queue.clear();
		bfs2();
		System.out.println(min);
	}

	public static void bfs(int i, int j) {
		visit[i][j] = true;
		map[i][j] = number;
		queue.offer(new int[] { i, j });
		while (!queue.isEmpty())  {
			int[] curr = queue.poll();
			for (int k = 0; k < 4; k++) {
				int dx = curr[0] + di[k];
				int dy = curr[1] + dj[k];
				if (dx >= 0 && dy >= 0 && dx < N && dy < N && !visit[dx][dy]) {
					visit[dx][dy] = true;
					map[dx][dy] = number;
					queue.offer(new int[] { dx, dy });
				}
			}
		}
	}

	public static void bfs2() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] != 0) {
					queue.offer(new int[] { i, j });
				}else {
					visit[i][j] = false;
				}
			}
		}
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			for (int k = 0; k < 4; k++) {
				int dx = curr[0] + di[k];
				int dy = curr[1] + dj[k];
				if (dx >= 0 && dy >= 0 && dx < N && dy < N) {
					if (map[dx][dy] != 0 && map[dx][dy] != map[curr[0]][curr[1]])
					{
						int a = dis[dx][dy] + dis[curr[0]][curr[1]];
						if(min > a) min =a ;
					}
					
					else if (!visit[dx][dy]) {
						visit[dx][dy] = true;
						map[dx][dy] = map[curr[0]][curr[1]];
						dis[dx][dy] = dis[curr[0]][curr[1]] + 1;
						queue.offer(new int[] { dx, dy });
					}
				}
			}
		}
	}

}
