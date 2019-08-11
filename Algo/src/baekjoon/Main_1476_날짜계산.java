package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1476_날짜계산 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int e= 0, s=0, m=0;
		int cnt =0;
		label: while (true) {
			for (int i = 1; i <= 28; i++) {
				if(e==15) e= 1;
				else e++;
				
				m = i;
				
				if(s==19) s= 1;
				else s++;
				
				cnt++;
				
				if(e == E && s ==S && m ==M) {
					break label;
				}
			}
		}
		System.out.println(cnt);
	}
}
