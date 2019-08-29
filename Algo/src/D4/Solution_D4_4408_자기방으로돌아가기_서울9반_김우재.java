package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution_D4_4408_자기방으로돌아가기_서울9반_김우재 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_4408.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());

			int[] room = new int[200]; 

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int a = (Integer.parseInt(st.nextToken())-1)/2;
				int b = (Integer.parseInt(st.nextToken())-1)/2;
				if(a>b) {int  t=a; a= b; b=t;}
				for (int j = a; j <=b; j++) room[j]++;
			}
			System.out.println("#" + tc + " "+Arrays.stream(room).max().getAsInt());
		}
	}
}