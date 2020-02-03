package jungol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_정올_2074_홀수마방진_서울9반_김우재 {
	
	public static int N, mabangjin[][];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N= Integer.parseInt(br.readLine());
		
		mabangjin = new int[N][N];
		
		fill(0,N/2,1);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mabangjin[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void fill(int x, int y, int number) {
		if(number>N*N)return;
		if(x<0) x = N-1;
		if(y<0) y = N-1;
		mabangjin[x][y] = number;
		if(number%N==0)fill(x+1,y,number+1);
		else fill(x-1, y-1, number+1);
	}
}
