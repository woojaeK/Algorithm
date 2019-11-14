package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_정올_2606_토마토초_서울9반_김우재 {

	public static int N, M, H, map[][][];
	public static boolean visit[][][];
	public static Queue<int[]> q;
	public static int[] di = { -1, 0, 1, 0, 0, 0};
	public static int[] dj = { 0, 1, 0, -1, 0, 0};
	public static int[] dh = {0, 0, 0, 0, 1, -1};
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		H = sc.nextInt();

		map = new int[M][N][H];
		visit = new boolean[M][N][H];
		q = new LinkedList<int[]>();

		for (int k = 0; k < H; k++) {
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j][k] = sc.nextInt();
					if (map[i][j][k] == 1)
						q.add(new int[] { i, j, k });
					if (map[i][j][k] == -1)
						visit[i][j][k] = true;
				}
			}
		}

		int dab = bfs();
		boolean chk = false;
		label: for (int k = 0; k < H; k++) {
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (map[i][j][k] == 0) {
						chk = true;
						break label;
					}
				}
			}
		}
		if (chk)
			System.out.println("-1");
		else
			System.out.println(dab - 1);
	}

	private static int bfs() {
		int day = 0;
		while (!q.isEmpty()) {
			int a = q.size();
			for (int i = 0; i < a; i++) {
				int[] curr = q.poll();
				for (int j = 0; j < 6; j++) {
					int x = curr[0] + di[j];
					int y = curr[1] + dj[j];
					int h = curr[2] + dh[j];
					if (x >= 0 && y >= 0 && x < M && y < N && h< H && h>=0&&!visit[x][y][h] && map[x][y][h] == 0) {
						q.add(new int[] { x, y,h });
						map[x][y][h] = 1;
					}
				}
			}
			day++;
		}
		return day;
	}
}
