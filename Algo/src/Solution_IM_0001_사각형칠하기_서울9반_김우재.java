import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_IM_0001_사각형칠하기_서울9반_김우재 {
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

			int max = -1;
			int[] dab = new int[11];
			for (int i = 0; i < K; i++) {
				int cnt = 0;
				boolean check = false;
				st = new StringTokenizer(br.readLine());
				start.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
				end.add(new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) });
				color.add(Integer.parseInt(st.nextToken()));
				label: for (int j = start.get(i)[0]; j <= end.get(i)[0]; j++) {
					for (int l = start.get(i)[1]; l <= end.get(i)[1]; l++) {
						if(map[j][l] > color.get(i)) {
							check = true;
							break label;
						}
					}
				}
				if(!check) {
					for (int j = start.get(i)[0]; j <= end.get(i)[0]; j++) {
						for (int l = start.get(i)[1]; l <= end.get(i)[1]; l++) {
							map[j][l]=color.get(i); 
						}
					}
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					dab[map[i][j]]++;
				}
			}
			Arrays.sort(dab);
			System.out.println("#" + tc + " " +dab[10]);
		}
	}
}