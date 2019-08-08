package stack2;

import java.util.Scanner;

public class Solution_D3_2806_NQueen_서울_9반_김우재 {
	public static int N;// 행렬 크기
	public static int result;// 갈수 있는 방법의 수
	public static int[] col; //index가 i 값이 j 이차원 배열을 이차원으로 표현
	
	public static void nqueen(int i,String ij) {
		if(i==N) {
			result++;
			System.out.println(ij);
			return;
		}
		for (int j = 0; j < N; j++) {
			col[i] = j;
			if(promising(i)) nqueen(i+1,ij+"("+i+","+col[i]+")");
		}
	}
	
	private static boolean promising(int i) { // 전진 할지 말지 결정
		for (int j = 0; j < i; j++) {
			if(col[j] == col[i] || Math.abs(col[i] -col[j]) == (i-j)) return false; // 같은 축에 있는지랑 대각선에 있는냐 찾기
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		col = new int[N];
		nqueen(0,"");
		System.out.println(result);
	}
}
