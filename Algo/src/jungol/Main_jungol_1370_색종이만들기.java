package jungol;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_jungol_1370_색종이만들기 {

	public static int N, paper[][], blue, white;
	public static boolean visit[][];
	public static int di[] = {-1, 0, 1, 0};
	public static int dj[] = {0, 1, 0, -1};
	
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_jungol_1370_색종이만들기.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		paper = new int[N][N];
		visit = new boolean[N][N];
		blue = 0;
		white = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		solve(0, 0);
	}

	private static void solve(int x, int y) {
		
		Queue<int[]> q= new LinkedList<int[]>();
		q.offer(new int[] {x, y});
		while(!q.isEmpty()) {
			int[] curr= q.poll();
			for (int i = 0; i < 4; i++) {
				
			}
		}
	}
}
