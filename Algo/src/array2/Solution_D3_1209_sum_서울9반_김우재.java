package array2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_D3_1209_sum_서울9반_김우재{//제출시 class 명은 반드시 Solution
	public static void main(String args[]) throws Exception
	{
//선생님 풀이
		System.setIn(new FileInputStream("res/input_d3_1289.txt"));
		Scanner sc =new Scanner(System.in);
		
		for(int tc = 1; tc <=10; tc ++) {
			int t = sc.nextInt();
			int N = 100;
			int[][] a = new int[N][N];
			int max = -1;
			
			for(int i=0; i<N; i++) {
				int sum = 0;
				for(int j = 0; j < N; j++) {
					a[i][j] = sc.nextInt();
					sum += a[i][j];
				}
				if(max < sum) max = sum;
			}
			
			int sum1 = 0;
			int sum2 =0;
			for(int i=0; i<N; i++) {
				int sum = 0;
				for(int j = 0; j < N; j++) {
					sum += a[j][i];
					if(i==j) sum1 += a[i][j];
					if((i+1)==(N-1)) sum2 += a[i][j];
				}
				if(max < sum) max = sum;
			}
			
			if(max<sum1) max = sum1;
			if(max<sum2) max = sum2;
			
			System.out.println("#"+tc+" "+max);
		}
		
/*공통 입력 및 초기화
  		Scanner sc = new Scanner(System.in);
		int T;
		
		for(int t = 1; t <= 10; t++) {
			
			T=sc.nextInt();
			
			int[][] x = new int[100][100];
			int[] sum = new int[202];
			int number = 0;
			int sum = 0;
			int max = -1;
			
			for(int i = 0; i<x.length; i++) {	
				for(int j = 0; j<x.length; j++) {
					number = sc.nextInt();
					x[i][j] = number;
				}
			}
				System.out.println("#" + t + " " + max);
		}
*/
		
/*두번째 max값 초기화하면서 찾기 합 배열 안씀
 			for(int i = 0; i<x.length; i++) {	
				for(int j = 0; j<x.length; j++) {
						sum = sum + x[i][j];
						if(max < sum)
						{
							max = sum;
						}		
				}
				sum = 0;
				for(int j = 0; j<x.length; j++) {
					sum = sum + x[j][i];
					if(max < sum)
					{
						max = sum;
					}		
				}
				sum=0;
				sum = sum + x[i][99-i];
				if(max < sum)
				{
					max = sum;
				}
				sum = 0;
				sum = sum + x[99-i][i];
				if(max < sum)
				{
					max = sum;
				}
				sum=0;
			}
*/
			
//첫번째 각 행열 대각선의 합을 배열로 저장해서 큰수 찾기
/*			
			for(int i = 0; i<x.length; i++) {	
				for(int j = 0; j<x.length; j++) {
					if(i<99) {
					sum[i] = sum[i] + x[i][j];
					}sum[i+99] = sum[i+99] + x[j][i];
				}
				sum[200] = sum[200] + x[i][99-i];
				sum[201] = sum[201] + x[99-i][i];			
			}
			
			int max = -1;
			
			for(int i= 0; i < sum.length; i++) {
				if(max < sum[i]) {
					max = sum[i];
				}
			}

			System.out.println("#" + t + " " + max);
		}
		*/
	}
}


