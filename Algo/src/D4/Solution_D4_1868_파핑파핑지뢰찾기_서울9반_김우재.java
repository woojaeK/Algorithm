package D4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_D4_1868_파핑파핑지뢰찾기_서울9반_김우재 {

	public static int N, map[][];
	public static int[] di = {-1, -1, 0, 1, 1, 1, 0, -1};
	public static int[] dj = {0, 1, 1, 1, 0, -1, -1, -1};
	public static boolean[][] visit;
	public static Queue<int[]> q;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= 1; tc++) {
			N = Integer.parseInt(br.readLine());
			
			map = new int[N][N];
			visit = new boolean[N][N];
			q = new LinkedList<>();
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					String a = st.nextToken();
					if(a.equals("*")) {
						map[i][j] = -1;
						visit[i][j] = true;
					}
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(map[i][j] == -1) {
						for (int k = 0; k < 8; k++) {
							int x = i + di[k];
							int y = j + dj[k];
							if(x>=0&&y>=0&&x<N&&y<N) {
								map[x][y]++;
							}
						}
					}
				}
			}
			
			for (int[] a : map) {
				System.out.println(Arrays.toString(a));
			}
		}
	}
}
