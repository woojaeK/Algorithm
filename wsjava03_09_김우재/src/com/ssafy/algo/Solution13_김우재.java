package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Solution13_김우재{
	static int N;
	static int Answer;

	public static final int[] di = { -1, -1, 0, 1, 1, 1, 0, -1 };
	public static final int[] dj = { 0, 1, 1, 1, 0, -1, -1, -1 };

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			char[][] area = new char[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					String s = sc.next();//G, B
					area[i][j] = s.charAt(0);
				}
			}
			
			

			Answer = 0;
			int count = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int g = 0;

					if (area[i][j] == 'B') {
												 
						for (int x = 0; x < di.length; x++) {
							int newi = i + di[x];
							int newj = j + dj[x];

							if (isInArea(newi, newj) && area[newi][newj] == 'G') {
								g++;
							}
						}

						if (g == 0) {

							count = 0;
							for (int k = 0; k < N; k++) {
								if (area[k][j] == 'B') {
									count++;
								}
							}
							
							for (int k = 0; k < N; k++) {
								if (area[i][k] == 'B') {
									count++;
								}
							}
							
							count--;
							
							if (count > Answer)
								Answer = count;
						}
					} 
				} 
			} 

			System.out.println("#" + tc + " " + Answer);
		}
	}

	private static boolean isInArea(int newi, int newj) {
		return (newi >= 0 && newi < N && newj >= 0 && newj < N);
	}
}