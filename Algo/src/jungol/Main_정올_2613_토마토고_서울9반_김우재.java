package jungol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_정올_2613_토마토고_서울9반_김우재 {
	
	public static int N, M, map[][];
	public static boolean visit[][];
	public static Queue<int[]> q;
	public static int[] di = {-1, 0, 1, 0};
	public static int[] dj = {0, 1, 0, -1};
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[M][N];
		visit = new boolean[M][N];
		q = new LinkedList<int[]>();
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1) q.add(new int[] {i,j});
				if(map[i][j] == -1) visit[i][j] = true;
			}
		}
		
		int dab = bfs();
		boolean chk = false;
		label: for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j] == 0) {
					chk = true;
					break label;
				}
			}
		}
		if(chk) System.out.println("-1");
		else System.out.println(dab-1);
	}

	private static int bfs() {
		int day = 0;
		while(!q.isEmpty()) {
			int a  = q.size();
			for (int i = 0; i < a; i++) {
				int[] curr = q.poll();
				for (int j = 0; j < 4; j++) {
					int x  = curr[0] + di[j];
					int y = curr[1] + dj[j];
					if(x>=0&&y>=0&&x<M&&y<N&&!visit[x][y]&&map[x][y] == 0) {
						q.add(new int[] {x,y});
						map[x][y] = 1;
					}
				}
			}
			day++;
		}
		return day;
	}
}
