package array1;

import java.util.Arrays;

public class Array2Test {

	public static void main(String[] args) {
		// 1. 선언
		int[][] a;// int a[][];
		// 2. 생성
		a = new int[3][3];
		// 1+2 선언+생성

//		int[][][][][] b = new int[3][][][][]; //맨앞에만 선언해주면 된다 .

		int[][] b = new int[3][3];
		// 3.초기화
		b[0][0] = 10;
		b[1][1] = 11;
		b[2][2] = 12;
		
		// 1+2+3 선언+생성+초기화
		int[][] c = { { 10, 0, 0 }, { 0, 11, 0 }, { 0, 0, 12 } };
		int[][] d = new int[][] { { 10, 0, 0 }, { 0, 11, 0 }, { 0, 0, 12 } };
		// 1, 2+3
	
		/*
		 * e = {{10,0,0}, {0,11,0}, {0,0,12}}; //err
		 */
		int[][] e;
		e = new int[][] { { 10 }, { 0, 11 }, { 0, 0, 12 } };
		
		// 4. 출력
		/*for (int i = 0; i < e.length; i++) { //인덱스가 필요할때 
			for (int j = 0; j < e[i].length; j++) {
				System.out.print(e[i][j] + " ");
			}
			System.out.println();
		}

		for (int[] va : e) { //인덱스가 없음 
			for (int v : va) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int[] v : e)System.out.println(Arrays.toString(v)); */
		
		//5. 복제
		int[][] f = new int[e.length][];
		for(int i = 0; i <e.length; i++) {
			//f[i] = new int[e[i].length];
			//System.arraycopy(e[i], 0, f[i], 0, e[i].length);
			f[i] = Arrays.copyOf(e[i], e[i].length);
		}
		
		e[0][0] =0;
		for(int[] v:e) System.out.println(Arrays.toString(v));
		for(int[] v:f) System.out.println(Arrays.toString(v));
	} 
}

