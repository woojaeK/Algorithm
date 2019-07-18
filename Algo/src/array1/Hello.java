package array1;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, sum = 0, b = 0, c = 0;
		int[] array = new int[50];
		int[] array2  = new int [50];
		int T;
		
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		
		array[0] = T;
		
		while(true) {
			if(array[b] != 1) {
				array[b+1] = array[b]/2;
			
				array2[c] = array[b]%2;
			
				b++;
				c++;
			
				if(array2[c] != array2[c+1]) {
					sum++;
				}
			}
			break;
		}
	}	
}
