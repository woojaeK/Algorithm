package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_7576_토마토 {
	
	public static int M;
	public static int N;
	public static int[][] graph;
	public static ArrayList<int[]> list;
	public static int count;
	public static Queue<ArrayList> queue;
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		graph = new int[N][M];
		list = new ArrayList<>();
		queue = new LinkedList<>();
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int sdf = Integer.parseInt(st.nextToken());
				graph[i][j] = sdf;
				if(sdf == 1) list.add(new int[] {i,j});
			}
		}
		//1인 좌표를 배열로 넣어서 동시에 시작하고 함수내에서는 사방향 동시에 퍼지게 하기 네개 하번에쓰기
		
	}
	
	
	public static void bfs2(int node) {
		int cnt = 0;
		queue.offer(node);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int curr = queue.poll();
				System.out.println(curr + " ");
				
				for (int next = 0; next < V; next++) {// 0 1 2 3 4 5 6
					if (visit[next] == 1 && graph[curr][next] == 0) {
						visit[next] = true;
						queue.offer(next);
					}
				}
			}
			System.out.println("level : "+ cnt++); // 해당 레벨의 갯수 
		}
	}
	
	
} 
