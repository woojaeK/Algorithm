package array1;//정답제출시 package 삭제
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution_D1_1289_원재의메모리복구하기_서울9반_김우재{//제출시 class 명은 반드시 Solution
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			String s = sc.next();
			int sum = 0;
			
			s = "0"+s;
			
			char[] ca = s .toCharArray();
			
			for(int j=0; j < ca.length-1; j++){
				if(ca[j] != ca[j+1]) {
					sum= sum+1;
				}
			}

			System.out.println("#"+ i +" " + sum);
		}
	}
}
