package jungol;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_1370_회의실배정 {

	public static int[][] conference;
	public static int N;
	public static int[] V;
	static int time, max;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_jungol_1370.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		conference = new int[N][3];
		V = new int[N];
		time = 0;
		max = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			conference[i][0] = a;
			conference[i][1] = b;
			conference[i][2] = c;
		}
		
		Arrays.sort(conference, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] <= o2[2] ? -1:1;
			}
		});
		
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(conference[0]);
		
		for (int i = 1; i < conference.length; i++) {
			if(list.get(list.size()-1)[2] <= conference[i][1]) {
				list.add(conference[i]);
			}
		}
		System.out.println(list.size());
		for (int[] is : list) {
			System.out.print(is[0]+" ");
		}
	}
}
