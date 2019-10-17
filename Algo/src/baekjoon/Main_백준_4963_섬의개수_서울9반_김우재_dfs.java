package baekjoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_4963_섬의개수_서울9반_김우재_dfs {

	public static int W;
	public static int H;
	public static int[][] graph;
	public static int[] di = { -1, -1, 0, 1, 1, 1, 0, -1 };
	public static int[] dj = { 0, 1, 1, 1, 0, -1, -1, -1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while(true){
			String s = br.readLine();
			st = new StringTokenizer(s);
			W = Integer.parseInt(st.nextToken());
			H = Integer.parseInt(st.nextToken());
			if(W==0&&H==0) break;
			graph = new int[H][W];
			for (int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < W; j++) {
					graph[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int cnt = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (graph[i][j] == 1) {
						dfs(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		} 
	}

	public static void dfs(int x, int y) {
		graph[x][y] = 0;
		for (int i = 0; i < di.length; i++) {
			int dx = x + di[i];
			int dy = y + dj[i];
			if (dx >= 0 && dy >= 0 && dx < H && dy < W && graph[dx][dy] == 1) {
				dfs(dx, dy);
			}
		}
	}

}