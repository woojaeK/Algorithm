package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class  Main_16234_인구이동 {

	public static int N, L, R, map[][], map2[][], cnt;
	public static boolean chk;
	public static int[] di = {-1, 0, 1, 0};
	public static int[] dj = {0, 1, 0, -1};
	
	public static void main(String[] args) throws Exception{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		/*
		N x N 크기 r행 c열 정사각형
		인구 이동 성공  인접한 국경선 L명 이상 R명이하 모두 열리면 이동 시작
		연한의 인구수 / 연합을 이루고 있는 칸의 개수  소슈점 버림 
		인구 이동 횟수 구하기 
		첫째줄 N L R
		둘째줄 N개의 줄 
		*/
		
		//BFS로 색칠하기 건물 갯수 구하기 처럼
		//색칠한 건물 더해주기 색칠한 건물수 나누기  다시 집어 넣으면서 false 체크
		//다시 돌리기 근데 바뀐게 없으면 끝내기 
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		map2 = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		solution();
		System.out.println(cnt);
	}

	private static void solution() {
		BFS();
	}

	private static void BFS() {
		boolean visit[][] = new boolean[N][N];
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {0,0});
		cnt = 1;
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			visit[curr[0]][curr[1]] = true;
			for (int i = 0; i < 4; i++) {
				int x = curr[0] + di[i];
				int y = curr[1] + dj[i];
				if(x>=0 && y >=0 && x < N && y <N && !visit[x][y]) {
					int z = Math.abs(map[curr[0]][curr[1]] - map[x][y]);
					if(z >=L && x <=R) {
						map2[x][y] = cnt;
						map2[x][y] = cnt;
						chk  = true;
					}
					q.offer(new int[] {x,y});
				}
			}
		}
		
	}
}
