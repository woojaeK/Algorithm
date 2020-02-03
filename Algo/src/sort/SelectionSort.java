package sort;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.StringTokenizer;

public class SelectionSort {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/selectionsort.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < array.length; i++) {
			int min = Integer.MAX_VALUE;
			int chk = 0;
			for (int k = i; k < array.length; k++) {
				if(min > array[k]) {
					min = array[k];
					chk = k;
				}
			}
			int tmp = array[i];
			array[i] = min;
			array[chk] = tmp;
		}
		
		System.out.println(Arrays.toString(array));
	}
}
