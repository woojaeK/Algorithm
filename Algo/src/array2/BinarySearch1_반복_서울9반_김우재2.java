package array2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1_반복_서울9반_김우재2 {

	public static int[] a = {2,4,5,11,19,23};
	
	private static boolean binarysearch(int key) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start <= end) {
			
			int middle = (start + end)/2;
			
			if(a[middle] == key) {
				return true;
			}
			else if (a[middle] > key) {
				end = middle -1;
			}
			else {
				start = middle +1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println(binarysearch(key));
		System.out.println(Arrays.binarySearch(a, key));
	}

}
