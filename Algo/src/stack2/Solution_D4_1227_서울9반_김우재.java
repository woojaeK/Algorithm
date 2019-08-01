package stack2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_D4_1227_서울9반_김우재 {

	public static int[] di = { 0, 0, -1, 1 };
	public static int[] dj = { -1, 1, 0, 0 };
	public static int[][] visit ;
	public static int[][] maze;
	public static int dab = 0;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_d4_1227.txt"));
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			visit = new int[100][100];
			maze = new int[100][100];
			int[] start = new int[2];
			int[] finish = new int[2];
			dab =0;
			String zero = sc.nextLine();

			for (int i = 0; i < 100; i++) {
				String S = sc.nextLine();
			//	System.out.println(S);
				for (int j = 0; j < 100; j++) {
					char c = S.charAt(j);
					maze[i][j] = c - '0';
					if (maze[i][j] == 2) {
						start[0] = i;
						start[1] = j;
					}
					if (maze[i][j] == 3) {
						finish[0] = i;
						finish[1] = j;
					}
				}
			}
			
			dfs(start[0], start[1],finish[0], finish[1]);
			System.out.println("#" + tc + " " + dab);
		}
	}

	public static void dfs(int s1, int s2, int f1, int f2) {

		visit[s1][s2] = 1;
		
		if (s1 == f1 && s2 == f2) {
			dab = 1;
			return;
		}

		for (int d = 0; d < di.length; d++) {
			int ni = s1 + di[d];
			int nj = s2 + dj[d];

			if (0 <= ni && ni < 100 && 0 <= nj && nj < 100 && maze[ni][nj] == 0 && visit[ni][nj] == 0 ||maze[ni][nj] ==3) {
				dfs(ni, nj, f1 , f2);
			}
		}

	}
}
