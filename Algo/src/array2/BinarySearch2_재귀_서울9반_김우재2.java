package array2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2_재귀_서울9반_김우재2 {

	public static int[] a = {2,4,5,11,19,23};
	
	private static boolean binarysearch(int low, int high, int key) {
		if (low > high) return false;
		
		int middle = (low+high)/2;
		
		if(a[middle] == key) return true;
		else if(a[middle]> key) return binarysearch(low, middle-1,key);
		else return binarysearch(middle+1, high, key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println(binarysearch(0,a.length-1,key));
		System.out.println(Arrays.binarySearch(a, key));
	}

}
