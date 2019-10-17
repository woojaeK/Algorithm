package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_백준_16234_인구이동_서울9반_김우재 {

	public static int N, L, R, map[][], cnt, sum;
	public static Queue<xy> q;
	public static Queue<xy> q1;
	public static boolean visit[][], check;
	public static boolean visit2[][];
	public static int[] di = { -1, 0, 1, 0 };
	public static int[] dj = { 0, 1, 0, -1 };

	static class xy {
		int x, y;

		xy() {
		}

		xy(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		map = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		cnt = 0;
		q = new LinkedList<>();
		q1 = new LinkedList<>();
		boolean TL = false;
		int dab = 0;
		while (true) {
			visit = new boolean[N][N];
			TL = false;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visit[i][j]) {
						sum = 0;
						cnt = 0;
					
						bfs(i, j);
						sum += map[i][j];
						cnt++;
						q1.offer(new xy(i, j));
						
						int aa= 0;
						if(q1.size()>1) {
							aa = sum/cnt;
						}else{
							q1.clear();
						}
						
						while(!q1.isEmpty()) {	
							TL = true;
							xy qwer = q1.poll();
							map[qwer.x][qwer.y] =aa;
						}
					}
				}
			}
			
			if(!TL) break;
			else {dab++;}
		}
		
		System.out.println(dab);
	}

	private static void bfs(int i, int j) {
		visit[i][j] = true;
		xy xy1 = new xy(i, j);
		q.offer(xy1);
		boolean chk = false;
		while (!q.isEmpty()) {
			xy curr = q.poll();
			for (int k = 0; k < 4; k++) {
				int x = curr.x + di[k];
				int y = curr.y + dj[k];
				if (x >= 0 && y >= 0 && x < N && y < N && !visit[x][y]) {
					int ckdl = Math.abs(map[x][y] - map[curr.x][curr.y]);
					if (ckdl >= L && ckdl <= R) {
						chk = true;
						visit[x][y] = true;
						xy nxy = new xy(x, y);
						q.offer(nxy);
						q1.offer(nxy);
						sum += map[x][y];
						cnt++;
					}
				}
			}
		}
	}
}
