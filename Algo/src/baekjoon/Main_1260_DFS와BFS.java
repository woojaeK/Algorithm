package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_1260_DFS와BFS {

	public static int N;
	public static int M;
	public static int V;
	public static int[][] graph;
	public static boolean[] visit;
	public static Stack<Integer> stack;
	public static Queue<Integer> queue;
	public static boolean[] visit2;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		stack = new Stack<Integer>();
		queue = new LinkedList<Integer>();
		
		graph = new int[N+1][N+1];
		for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				graph[x][y] = 1;
				graph[y][x] = 1;
 		}
		dfs(V);
		System.out.println();
		bfs(V);
	}
	
	public static void dfs(int node) {
		visit = new boolean	[N+1];
		stack.push(node);

		while(!stack.empty()) {
			int curr = stack.pop();
			if(visit[curr] == false) {
				visit[curr] = true;
				System.out.print(curr + " ");
				for (int next = N; next >= 1; next--) {
					if(visit[next] == false && graph[curr][next] == 1) {
						stack.push(next);
					}
				}
			}
		}
	}
	
	public static void bfs(int node) {
		visit2 = new boolean[N+1];
		queue.offer(node);
		while(!queue.isEmpty()) {
			System.out.println(queue);
			int curr = queue.poll();
			if(visit2[curr] == false) {
				visit2[curr] = true;
				System.out.print(curr+ " ");
				for (int next = 1; next <= N; next++) {
					if(visit2[next] == false && graph[curr][next] ==1) {
						queue.offer(next);
					}
				}
			}
		}
	}
}
