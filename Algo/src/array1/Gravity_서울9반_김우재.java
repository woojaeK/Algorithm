package array1;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Gravity_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[] x = new int[T];
		int[] y = new int[T];
		int[] z = new int[T];
		
		int sum = 0, max = -1;
		
		for(int i = 0; i<T; i++) x[i] = sc.nextInt();
		
		for(int i =0; i < T; i++) {
			for(int j= 0; j < x.length; j++) {
				if(x[j] > 0 ) {
					sum++;
				}
				x[j]--;
			}
			y[i] = T - sum;
			sum=0;
			if( T > y[i]) {
				if(max < y[i]) {
					max = y[i];
				}
			}
		}
		System.out.println(max);
		
		
	}
		
	}

