package baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_4963_섬의개수_서울9반_김우재_bfs {

	public static int map[][], W, H;
	public static Queue<int[]> q;
	public static boolean[][] visit;
	public static int[] di = {-1, -1, 0, 1, 1, 1, 0, -1};
	public static int[] dj = {0,   1, 1, 1, 0,-1,-1, -1};
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_4963.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			if(H == 0 && W ==0) break;
			map = new int[H][W];
			visit = new boolean[H][W];
			q = new LinkedList<int[]>();
			for (int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < W; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if(map[i][j] == 0) visit[i][j] = true;
				}
			}
			
			int cnt = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if(!visit[i][j]) {
						bfs(i,j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	public static void bfs(int i, int j) {
		visit[i][j] = true;
		q.offer(new int[] {i,j});
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			for (int k = 0; k < 8; k++) {
				int x = curr[0] + di[k];
				int y = curr[1] + dj[k];
				if(x>=0&& y>=0&& x<H&& y<W&& !visit[x][y]) {
					visit[x][y] = true;
					q.offer(new int[] {x,y});
				}
			}
		}
	}
}
