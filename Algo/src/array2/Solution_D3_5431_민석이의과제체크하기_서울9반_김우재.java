package array2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_D3_5431_민석이의과제체크하기_서울9반_김우재{//제출시 class 명은 반드시 Solution
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("res/input_d3_5431.txt"));
		Scanner sc =new Scanner(System.in);
		
		int T = sc.nextInt();

		for(int tc = 1; tc <= T; tc ++) {
			int student = sc.nextInt();
			int o = sc.nextInt();
			int[] list = new int[student];
			int check = 0;
			
			for(int i=0; i < o; i++) {
				int x = sc.nextInt();
				list[x-1] = x;
			}
		
			System.out.print("#" + tc + " ");
			for(int i=0; i < student; i++) {
				if(list[i] == 0) {
					check = i+1;
					System.out.print(check +" ");
				}	
			}
			System.out.println();
		}
	}
}


