package sort;

import java.util.Arrays;

public class QuickSort {
	
	public static int number =10;
	
	public static void main(String[] args) {
		int[] array = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		quicksort(array, 0, number-1);
		
		System.out.println(Arrays.toString(array));
	}

	private static void quicksort(int[] array, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start +1;
		int j = end;
		int temp;
		
		while(i <= j) { // 엇갈리 때까지 반복
			while(i<=end && array[i] <= array[key]) {//키값보다 큰경우
				i++;
			}
			while(array[j] >= array[key] && j >start) {//키값보다 작은경우  
				j--;
			}
			if(i>j) {
				temp = array[j];
				array[j] = array[key];
				array[key] = temp;
			} else {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;			
			}
		}
		
		quicksort(array, start, j-1);
		quicksort(array, j+1, end);
	}
}
