package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1840_치즈_서울9반_김우재 {

	public static int N, M, map[][], cnt;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];

		cnt = 1;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int time = -1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 0) {
					bfs(i, j);
				}
			}
		}

		for (int[] a : map) {
			System.out.print(Arrays.toString(a));
			System.out.println(cnt);
		}
	}

	public static void bfs(int i, int j) {
		map[i][j] = -1;
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] { i, j });
		cnt++;
		while (!q.isEmpty()) {
			int curr[] = q.poll();
			for (int k = 0; k < 4; k++) {
				int[] di = { -1, 0, 1, 0 };
				int[] dj = { 0, 1, 0, -1 };
				int x = curr[0] + di[k];
				int y = curr[1] + dj[k];
				if (x >= 0 && y >= 0 && x < N && y < M && map[x][y] != -1) {
					if (map[x][y] == 1) {
						map[x][y] = 2;
					}else if(map[x][y] == 0) {
						map[x][y] = -1;
						q.offer(new int[] { x, y });
					}
				}
			}
		}
	}
}
