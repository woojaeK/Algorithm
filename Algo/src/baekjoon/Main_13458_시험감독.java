package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13458_시험감독 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] a = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int dab = 0;
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] <= B) {
				sum++;
			}else {
				dab = (a[i]-B)/C;
				if((a[i]-B)%C != 0) sum += dab+2;
				else sum += dab+1;
			}
		}
		System.out.println(sum);
	}
}
