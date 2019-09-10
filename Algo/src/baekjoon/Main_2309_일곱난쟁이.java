package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2309_일곱난쟁이 {

	public static int f[],n,r,v[],a[];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		f = new int[9];
		for (int i = 0; i < 9; i++) {
			f[i] = Integer.parseInt(br.readLine());
		}
		
		n = 9;
		r = 7;
		a = new int[r];
		v = new int[n];
		Comb(0,0);
	}
	
	public static void Comb(int start, int count) {
		if(count == r) {
			int sum = 0;
			for (int i = 0; i < r; i++) {
				sum += a[i];
			}
			if(sum == 100) {
				Arrays.sort(a);
				for (int i = 0; i < r; i++) {
					System.out.println(a[i]);
				}
				return;
			}
			return;
		}
		for (int i = start; i < n; i++) {
			if(v[i] == 0) {
			   v[i] = 1;
			   a[count] = f[i];
			   Comb(i,count+1);
			   v[i] = 0;
			}
		}
	}
}
