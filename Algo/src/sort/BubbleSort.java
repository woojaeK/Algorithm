package sort;

import java.io.BufferedReader;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) throws Exception {
		int[] array = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length -1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
}
