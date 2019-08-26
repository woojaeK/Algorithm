package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7576_토마토{

	public static int M;
	public static int N;
	public static int[][] graph;
	public static boolean[][] visit;
	public static ArrayList<int[]> list;
	public static Queue<int[]> queue;
	public static int[] di = { -1, 0, 1, 0 };
	public static int[] dj = { 0, 1, 0, -1 };
	public static int day;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		graph = new int[N][M];
		visit = new boolean[N][M];
		list = new ArrayList<>();
		queue = new LinkedList<>();
		int[] aaaa = { 0, 0};
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int sdf = Integer.parseInt(st.nextToken());
				graph[i][j] = sdf;
				if (sdf == 1) {
					list.add(new int[] { i, j });
					visit[i][j] = true;
					aaaa[0]++;
				}
				if (sdf == -1) {
					visit[i][j] = true;
					aaaa[1]++;
				}
			}
		}
		// 1인 좌표를 배열로 넣어서 동시에 시작하고 함수내에서는 사방향 동시에 퍼지게 하기 네개 하번에쓰기
		for (int i = 0; i < list.size(); i++) {
			queue.offer(list.get(i));
		}
		dfs();
		boolean dab = false;

		label: for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (visit[i][j] == false) {
					dab = true;
					break label;
				}
			}
		}
		if (dab)
			System.out.println(-1);
		else if (aaaa[1] == N * M || aaaa[0] == N * M)
			System.out.println(0);
		else
			System.out.println(day - 1);
	}

	public static void dfs() {
		day = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int j = 0; j < size; j++) {
				int[] curr = queue.poll();
				for (int i = 0; i < di.length; i++) {
					int dx = curr[0] + di[i];
					int dy = curr[1] + dj[i];
					if (dx >= 0 && dy >= 0 && dx < N && dy < M && visit[dx][dy] == false) {
						visit[dx][dy] = true;
						int[] aa = { dx, dy };
						queue.offer(aa);
					}
				}
			}
			day++;
		}
	}
}
