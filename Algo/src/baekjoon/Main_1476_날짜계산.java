package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1476_날짜계산 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int e = 0; 
		int s = 0;
		int m = 0;
		int cnt =0;
		while(true) {
			if(e == E && s == S && m == M) break; 
			cnt ++;
			if(e == 15) e = 0;
			if(s == 28) s = 0;
			if(m == 19) m = 0;
			e++;
			s++;
			m++;
		}
		
		System.out.println(cnt);
	}
}
