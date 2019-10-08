package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1107_리모컨 {
	public static boolean[] broken = new boolean[10];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			broken[Integer.parseInt(st.nextToken())] = true;
		}

	
			int answer = N - 100;
			if(answer < 10) {
				answer =  -answer;
			}
			
			
			for (int i = 0; i <= 1000000; i++) {
				int c = i;
				int length = canMove(c);
				if(length > 0) {
					int press = c - N;
					if(press  <  0) {
						press = -press;
					}
					if(answer > length + press) {
						answer = length + press;
					}
				}
			}
		
		
		System.out.println(answer);
	}

	public static int canMove(int channel) {
		int length = 0;
		
		if(channel == 0) {
			return broken[0]? 0:1;
		}
		
		while(channel > 0) {
			if(broken[channel%10]) {
				return 0;
			}
			length +=1;
			channel /= 10;
		}
		return length;
	}
}
