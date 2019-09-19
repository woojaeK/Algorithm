package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_최장증가부분수열_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D3_3307.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] a = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				a[j] = Integer.parseInt(st.nextToken());
			}
			
			int n = a.length;

			int[] l = new int[n];//

			for (int i = 0; i < n; i++) {
				l[i] = 1;
				for (int j = 0; j < i; j++) {
					if (a[j] < a[i] && l[i] < 1 + l[j]) {
						l[i] = 1 + l[j];
					}
				}
			}
			System.out.println("#" + tc + " " + Arrays.stream(l).max().getAsInt()); 
		}
	}
}

