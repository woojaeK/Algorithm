package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_D9_5656_벽돌깨기_서울9반_김우재 {

	public static int N, W, H, map[][], sum, max, map2[][];
	public static int[] di = { -1, 0, 1, 0 };
	public static int[] dj = { 0, 1, 0, -1 };
	public static Queue<int[]> q;
	public static Queue<Integer> q2;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());

			map = new int[W][H];
			map2 = new int[W][H];
			for (int i = 0; i < W; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < H; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					sum += map[i][j];
				}
			}

			max = -1;
			solve(N);
			System.out.println("#" + tc + " " + max);
		}
	}

	private static void solve(int cnt) {
		if (cnt == 0) {
			int sum2 = 0;
			for (int i = 0; i < W; i++) {
				for (int j = 0; j < H; j++) {
					sum2 += map[i][j];
				}
			}
			if (max < sum - sum2) max = sum - sum2;
			return;
		}
		int x = 0, y = 0;
		for (int i = 0; i < W; i++) {
			for (int j = 0; j < W; j++) {
				map2[j] = map[j].clone();
			}
			for (int j = 0; j < H; j++) {
				if (map[i][j] != 0) {
					x = i;
					y = j;
					break;
				}
			}
			remove(x, y);
			sort();
			solve(cnt - 1);
			for (int j = 0; j < W; j++) {
				map[j] = map2[j].clone();
			}
		}
	}

	private static void sort() {
		q2 = new LinkedList<>();
		for (int i = 0; i < W; i++) {	
			for (int j = 0; j < H; j++) {
				if(map[i][j] != 0) {
					q2.offer(map[i][j]);
				}
			}
			for (int j = H-1; j >= 0; j--) {
				if(q2.isEmpty()) break;
				map[i][j] = q2.poll();
			}
		}
	}

	private static void remove(int x, int y) {
		q = new LinkedList<int[]>();
		while (!q.isEmpty()) {
			int l = map[x][y];
			for (int ghltn = 0; ghltn < l; ghltn++) {
				for (int i = 0; i < 4; i++) {
					int dx = x + di[i] * ghltn;
					int dy = y + dj[i] * ghltn;
					if (dx >= 0 && dy >= 0 && dx < W && dy < H) {
						map[dx][dy]--;
						if (map[dx][dy] != 0)
							q.offer(new int[] { dx, dy });
					}
				}
			}
		}

	}
}
