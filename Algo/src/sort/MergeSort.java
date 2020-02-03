package sort;

import java.util.Arrays;

//수정해야함
public class MergeSort {
	public static int number=8, size, sorted[], count=0;
	
	public static void main(String[] args) {
		int[] arr = {7,6,5,8,3,5,9,1};
		sorted = new int[8];
		
		mergesort(arr, 0, number-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void merge(int a[], int m, int middle, int n) {
		int i = m;
		int j = middle +1;
		int k = m;
		//작은 순서대로 배열에 삽입
		while(i <= middle && j <= n) {
			if(a[i] <= a[j]) {
				sorted[k] = a[i];
				i++;
			} else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		
		if(i > middle) {
			for (int t = j; t < n; t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		else {
			for (int t = i; t <= middle; t++) {
				sorted[k] = a[t];
				k++;
			}
		}
		
		//정렬된 배열을 삽입
		for (int t = m; t <= n; t++) {
			a[t] = sorted[t]; 
		}
	}
	
	public static void mergesort(int a[], int m, int n) {
		//이외의 경우는 크기가 1개인 경우
		if(m < n) {
			int middle = (m+n)/2;
			mergesort(a, m, middle);
			mergesort(a, middle+1, n);
			merge(a, m, middle, n);
		}
	}
}
