package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Solution_D3_1244_최대상금_서울9반_김우재 {
	public static int[] ss;
	public static int n, r, a[], v[], d[] = { 0, 1 };
	public static void powerset(int count) {// simple dfs example
		if (count == r) {
			for (int i = 0; i < r; i++) {
				if (a[i] == 1) {
				}
			}
			return;
		}
		for (int i = 0; i < n; i++) {
			a[count] = d[i];
			powerset(count + 1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D3_1244.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			String N = st.nextToken();
			int count = Integer.parseInt(st.nextToken());
			ss = new int[N.length()];
			for (int i = 0; i < N.length(); i++) {
				ss[i] = Character.getNumericValue(N.charAt(i));

			}
			
			StringBuilder sb =new StringBuilder();
			for (int i = 0; i < ss.length; i++) {
				sb.append(ss[i]);
			}
			System.out.println("#"+ tc +" "+ sb);
		}
	}
}
