package queue;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs {
	public static int V;
	public static int E;
	public static int[][] graph;
	public static boolean[] visit;
	public static Queue<Integer> queue;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_bfs.txt"));
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		graph = new int[V][V];
		queue = new LinkedList<Integer>();

		for (int i = 0; i < E; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			graph[v1][v2] = 1;
			graph[v2][v1] = 1;
		}

		for (int[] a : graph)
			System.out.println(Arrays.toString(a));
		bfs2(0);
		System.out.println();

		// visit = new boolean[V];
		// dfsr(0);
	}

	// 외우자
	public static void bfs(int node) {
		visit = new boolean[V];
		queue.offer(node);
		while (!queue.isEmpty()) {
			int curr = queue.poll();
			if (visit[curr] == false) {
				visit[curr] = true;
				System.out.println(curr + " ");

				for (int next = 0; next < V; next++) {// 0 1 2 3 4 5 6
					if (visit[next] == false && graph[curr][next] == 1) {
						queue.offer(next);
					}
				}
			}
		}
	}
	
	public static void dfsr(int node) {
		visit[node] = true;
		System.out.println(node + " ");

		for (int next = 0; next <= V; next++) {// 0 1 3 5 4 2 6
			if (visit[next] == false && graph[node][next] == 1) {
				dfsr(next);
			}
		}
	}

	public static void bfs2(int node) {
		int cnt = 0;
		visit = new boolean[V];
		visit[node] = true; // 방문처리하고 집어넣는다
		queue.offer(node);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int curr = queue.poll();
				System.out.println(curr + " ");
				
				for (int next = 0; next < V; next++) {// 0 1 2 3 4 5 6
					if (visit[next] == false && graph[curr][next] == 1) {
						visit[next] = true;
						queue.offer(next);
					}
				}
			}
			System.out.println("level : "+ cnt++); // 해당 레벨의 갯수 
		}
	}
 
	
}
