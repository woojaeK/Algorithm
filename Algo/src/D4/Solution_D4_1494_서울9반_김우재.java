package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D4_1494_서울9반_김우재 {

	public static int N, r,cnt, a[], v[];
	public static ArrayList<int[]> list;
	public static ArrayList<int[]> clist;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_1494.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= 3; tc++) {
			
			N = Integer.parseInt(br.readLine());
			list = new ArrayList<>();
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				list.add(new int[] { a, b });
			}
			
			r = N-2;
			a = new int[r];
			v = new int[N];
			clist = new ArrayList<>();
			Comb(0, 0);
		}
	}

	private static void Comb(int start, int count) {
		if (count == r) {
			System.out.println(Arrays.toString(a));
			
		}
		for (int i = start; i < N; i++) {
			if (v[i] == 0) {
				v[i] = 1;
				a[count] = i;
				Comb(i, count + 1);
				v[i] = 0;
			}
		}
	}
}
