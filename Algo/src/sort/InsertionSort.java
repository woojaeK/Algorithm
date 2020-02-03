package sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] array = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int aux = i-1;
			while((aux >= 0 ) && (array[aux] > temp)) {
				array[aux+1] = array[aux];
				aux--;
			}
			array[aux+1] = temp;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
