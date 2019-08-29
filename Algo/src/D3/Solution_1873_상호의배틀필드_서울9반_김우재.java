package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1873_상호의배틀필드_서울9반_김우재 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());

			char[][] map = new char[H][W];
			int[] start = null;
			for (int i = 0; i < H; i++) {
				st = new StringTokenizer(br.readLine());
				String S = st.nextToken();
				for (int j = 0; j < W; j++) {
					map[i][j] = S.charAt(j);
					if (map[i][j] == '<' || map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '>')
						start = new int[] { i, j };
				}
			}

			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			String S2 = st.nextToken();

			for (int i = 0; i < N; i++) {
				if (S2.charAt(i) == 'U') {
					if ((start[0] + 1) >= 0) {
						if (map[(start[0] - 1)][start[1]] == '.') {
							map[start[0]][start[1]] = '.';
							start[0] = start[0] - 1;
							map[start[0]][start[1]] = '^';
						} else {
							map[start[0]][start[1]] = '^';
						}
					}
				}
				if (S2.charAt(i) == 'D') {

					if ((start[0] + 1) < H) {
						if (map[(start[0] + 1)][start[1]] == '.') {
							map[start[0]][start[1]] = '.';
							start[0] = start[0] + 1;
							map[start[0]][start[1]] = 'v';
						} else {
							map[start[0]][start[1]] = 'v';
						}
					}
				}
				if (S2.charAt(i) == 'L') {

					if ((start[1] - 1) >= 0) {
						if (map[start[0]][(start[1] - 1)] == '.') {
							map[start[0]][start[1]] = '.';
							start[1] = start[1] - 1;
							map[start[0]][start[1]] = '<';
						} else {
							map[start[0]][start[1]] = '<';
						}
					}
				}
				if (S2.charAt(i) == 'R') {
					if ((start[1] + 1) < W) {
						if (map[start[0]][(start[1] + 1)] == '.') {
							map[start[0]][start[1]] = '.';
							start[1] = start[1] + 1;
							map[start[0]][start[1]] = '>';
						} else {
							map[start[0]][start[1]] = '>';
						}
					}
				}
				if (S2.charAt(i) == 'S') {
					if (map[start[0]][start[1]] == '^') {
						if ((start[0] + 1) < H) {
							for (int k = 0; k < start[0]; k++) {
								if (map[(start[0] + k)][start[1]] == '*') {
									map[(start[0] + k)][start[1]] = '.';
								}
								if (map[(start[0] + k)][start[1]] == '#') {
								}
							}
						}
					}
					if (map[start[0]][start[1]] == 'v') {
						for (int k = 0; k < (H - start[0]); k++) {
							if (map[(start[0] - k)][start[1]] == '*') {
								map[(start[0] - k)][start[1]] = '.';
							}
							if (map[(start[0] - k)][start[1]] == '#') {
							}
						}
					}
					if (map[start[0]][start[1]] == '<') {
						for (int k = 0; k < start[1]; k++) {
							if (map[start[0]][(start[1] - k)] == '*') {
								map[start[0]][(start[1] - k)] = '.';
							}
							if (map[start[0]][(start[1] - k)] == '#') {
							}
						}
					}
					if (map[start[0]][start[1]] == '>') {
						for (int k = 0; k < (W - start[1]); k++) {
							if (map[start[0]][(start[1] + k)] == '*') {
								map[start[0]][(start[1] + k)] = '.';
							}
							if (map[start[0]][(start[1] + k)] == '#') {
							}
						}
					}

				}
			}
			System.out.println("#" + tc + " ");
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}
}
