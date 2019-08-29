import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input44.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int[][] map = new int[N][M];
			ArrayList<int[]> start = new ArrayList<>();
			ArrayList<int[]> end = new ArrayList<>();
			ArrayList<Integer> color = new ArrayList<>();
			int[] dab = new int[11];
			int max = -1;
			for (int i = 0; i < K; i++) {
				int cnt = 0;
				st = new StringTokenizer(br.readLine());
				start.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
				end.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
				color.add(Integer.parseInt(st.nextToken()));

				if (i == 0) {
					for (int j = 0; j < N; j++) {
						for (int l = 0; l < M; l++) {
							if (l >= start.get(i)[0] && l <= end.get(i)[0] && j >= start.get(i)[1]&& j <= end.get(i)[1]) {
								map[j][l] = color.get(i);
								dab[color.get(i)]++;
							}
						}
					}
				} else {
					label: for (int j = 0; j < N; j++) {
						for (int l = 0; l < M; l++) {
							if (l >= start.get(i)[0] && l <= end.get(i)[0] && j >= start.get(i)[1]&& j <= end.get(i)[1]) {
								if (map[j][l] > color.get(i)) {
									break label;
								}
								map[j][l] = color.get(i);
								dab[color.get(i)]++;
							}
						}
					}
				}
			}
			System.out.println(Arrays.toString(dab));
			
		}
	}
}