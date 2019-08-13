package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1012_유기농배추 {

	public static int N;
	public static ArrayList<Integer>[] graph;
	public static boolean[] visit;
	public static Queue<Integer> queue;
	public static int cnt;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		queue = new LinkedList<Integer>();

		for (int tc = 0; tc < T; tc++) {
			cnt = 0;

			// 현재점이랑 이동점이랑 더햇을떄 2이면 ? 여튼 다시풀기
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			System.out.println(M + "  " + "   " + );
			graph = (ArrayList<Integer>[]) new ArrayList[K + 1];

			visit = new boolean[N + 1];
			for (int i = 0; i < K + 1; i++) {
				graph[i] = new ArrayList<Integer>(); // 정점의 수 + 1만큼 초기화
			}
			
			int x = 0, y = 0;
			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				graph[x].add(y);
				graph[y].add(x);
			}

			for (int i = 1; i <= N; i++) {
				if (visit[i] == false)
					bfs(i);
			}

			System.out.println(cnt);
		}
	}

	public static void bfs(int node) {
		queue.offer(node);
		while (!queue.isEmpty()) {
			int curr = queue.poll();
			if (visit[curr] == false) {
				visit[curr] = true;
				for (int next : graph[curr]) {
					queue.offer(next);
				}
			}
		}
		cnt++;
	}
}
