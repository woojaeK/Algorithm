package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1149_RGB거리_서울9반_김우재 {

	public static int N , a1, a2, a3, b1, b2, b3;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			a1 = Math.min(b2+ r, b3 + r);
			a2 = Math.min(b1 + g, b3 + g);
			a3 = Math.min(b1 + b, b2 + b);
			b1 = a1;
			b2 = a2;
			b3 = a3;
		}
		System.out.println(Math.min(a1, Math.min(a2, a3)));
	}
}
