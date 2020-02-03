package jungol;
/*
package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_정올_1335_색종이만들기_서울9반_김우재 {

	public static int[][] graph;
	public static Queue<int[]> queue;
	public static int dab;
	public static int[] di = {0,1,1};
	public static int[] dj = {1,1,0};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		graph = new int[N][N];
		queue = new LinkedList<int[]>();
		dab =0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				dfs(i,j);
			}
		}
	}
	
	public static void dfs(int x, int y) {
		int a = graph[x][y];
		int[] b = {x,y};
		queue.offer()
		
	}
}
*/