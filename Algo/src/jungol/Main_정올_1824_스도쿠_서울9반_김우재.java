package jungol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_정올_1824_스도쿠_서울9반_김우재 {

	public static int map[][];
	public static ArrayList<int[]> list;
	public static boolean flag;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		map = new int[9][9];
		list = new ArrayList<>();
		flag = false;

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 0)
					list.add(new int[] { i, j });
			}
		}

		dfs();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void dfs() {
		for (int i = 0; i < list.size(); i++) {
			int x = list.get(i)[0];
			int y = list.get(i)[1];
			if (map[x][y] == 0) {
				for (int j = 1; j <= 9; j++) {
					if (check(x, y, j)) {
						map[x][y] = j;
						dfs();
						if(flag) return;
						map[x][y] = 0;
					}
				}
				return;
			}
		}
		flag = true;
		return;
	}

	private static boolean check(int x, int y, int j) {
		for (int i = 0; i < 9; i++) {
			if (map[x][i] == j ||map[i][y] == j)
				return false;
		}
		int a = (x / 3) * 3, b = (y / 3) * 3;
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				if (map[a + i][b + k] == j)
					return false;
			}
		}
		return true;
	}
}