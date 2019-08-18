package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_9466_텀프로젝트 {

	public static boolean[] visit;
	public static boolean[] visit2;
	public static int[] list;
	public static int N;
	public static int cnt =0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());

			list = new int[N + 1];
			visit = new boolean[N + 1];
			visit2 = new boolean[N + 1];
			cnt = 0;
			
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				int a = Integer.parseInt(st.nextToken());
				list[i] = a;
			}

			for (int i = 1; i <= N; i++) {
				dfs(i);
			}

			System.out.println(N - cnt);
		}
	}

	public static void dfs(int now) {
		if (visit[now])  return;
		
		visit[now] = true;
		int next = list[now];
		
		if (visit[next] != true) {
			dfs(next);
		} 
		else {
			if (visit2[next] != true) {
				cnt++;
				for (int i = next; i !=now; i = list[i]) {
					cnt++;
				}
			}
		}
		visit2[now] = true;
	}
}
