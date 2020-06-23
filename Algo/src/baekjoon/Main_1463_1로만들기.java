package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1463_1로만들기 {

	public static int N, dab;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		dab = 0;
		
		solution();
		
		System.out.println(dab);
	}

	private static void solution() {
		first(N);
		second(N);
		third(N);
	}

	private static void third(int n2) {
		if(n2%3 != 0) return;
	}

	private static void second(int n2) {
		
	}

	private static void first(int n2) {
		
	}
}
