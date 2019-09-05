package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_정올_2634_사냥꾼_서울9반_김우재2 {
	
	public static class Point implements Comparable<Point>{
		int r,c;
		public Point(int r, int c) {
			this.r = r;
			this.c = c;
		}
		public static void compare {
			return Integer.compareTo(this.r + this.c,o.r + o.c);
		}
	} 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] MX = new int[M];
		int max =-1;
		for (int i = 0; i < M; i++) {
			MX[i] = Integer.parseInt(st.nextToken());
			if(max < MX[i]) max = MX[i];
		}

		int[] map = new int[(max+L+1)];
		for (int i = 0; i < MX.length; i++) {
			map[MX[i]] = L;
			for (int j = 1; j <= L; j++) {
				if(MX[i]-j >=0) {
					if(map[(MX[i]-j)] < L-j) map[(MX[i]-j)] = L-j;
				}
				if(map[(MX[i]+j)] < L-j) map[MX[i]+j] = L-j;
			}
		}
		int cnt =0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(map[a] >=b) cnt++;
		}
		System.out.println(cnt);
	}
}
