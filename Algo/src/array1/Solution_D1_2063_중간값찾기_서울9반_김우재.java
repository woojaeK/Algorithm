package array1;//정답제출시 package 삭제
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution_D1_2063_중간값찾기_서울9반_김우재{//제출시 class 명은 반드시 Solution
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		int[] array = new int[T];
		
		for(int i=0; i<T; i++) {
			array[i] = sc.nextInt();
		}
		
		int temp = 0;
		for(int i = array.length-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.print(array[(T-1)/2]);
	}
}