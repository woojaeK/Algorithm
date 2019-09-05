package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.chrono.MinguoChronology;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main_정올_1828_냉장고_서울9반_김우재 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		
		int[][] matter = new int[N][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			matter[i][0] = start;
			matter[i][1] = end;
		}
		//정렬
		Arrays.sort(matter, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[1]);
			}
		});
		int cnt = 1;
		int max = matter[0][1];
		for (int i = 0; i < N; i++) {
			if(max<matter[i][0]) {
				cnt++;
				max = matter[i][1];
			}
		}
		System.out.println(cnt);
	}
}