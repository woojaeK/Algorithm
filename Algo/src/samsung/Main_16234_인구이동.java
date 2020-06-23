package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_16234_인구이동 {

	public static int N, L, R, map[][], map2[][], cnt;
	public static boolean visit[][], chk;

	public static int[] di = { -1, 0, 1, 0 };
	public static int[] dj = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		/*
		 * N x N 크기 r행 c열 정사각형 인구 이동 성공 인접한 국경선 L명 이상 R명이하 모두 열리면 이동 시작 연한의 인구수 / 연합을
		 * 이루고 있는 칸의 개수 소슈점 버림 인구 이동 횟수 구하기 첫째줄 N L R 둘째줄 N개의 줄
		 */
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		map = new int[N][N];

		cnt = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		while (true) {
			boolean a = false;
			visit = new boolean[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visit[i][j] && BFS(i, j)) {
						a = true;
					}
				}
			}
			
			// 인구 이동시키기
			if (!a)
				break;
			else
				cnt++;
		}

		System.out.println(cnt);
	}

	private static boolean BFS(int sx, int sy) {

		Queue<int[]> q = new LinkedList<int[]>();
		ArrayList<int[]> list = new ArrayList<>();
		visit[sx][sy] = true;
		list.add(new int[] {sx,sy});
		q.offer(new int[] {sx, sy});
		chk = false;
		int hap = map[sx][sy];
		
		while (!q.isEmpty()) {
			int[] curr = q.poll();
			for (int i = 0; i < 4; i++) {
				int x = curr[0] + di[i];
				int y = curr[1] + dj[i];
				if (x >= 0 && y >= 0 && x < N && y < N && !visit[x][y]) {
					int z = Math.abs(map[curr[0]][curr[1]] - map[x][y]);
					if (z >= L && z <= R) {
						visit[x][y] = true;
						hap += map[x][y];
						list.add(new int[] {x,y});
						chk = true;
						q.offer(new int[] {x, y});
					}
				}
			}


		}
		
		if (chk) {
			for (int[] is : list) {
				map[is[0]][is[1]] = hap/list.size();
			}
		}
		return chk;
	}
}
