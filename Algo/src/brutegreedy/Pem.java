package brutegreedy;

import java.util.Arrays;
import java.util.Scanner;

public class Pem {
	public static int n, cnt, d[] = { 1, 2, 3, 4};

	public static void swap(int i, int j) {
		if(i==j) return;
		int T = d[i]; d[i]= d[j]; d[j] = T;
 	}
	
	public static void perm(int count) {
		if (count == n) {
			cnt++;
			System.out.println(Arrays.toString(d));
			return;
		}
		for (int i = count; i < n; i++) {//start를 쓰면 조합 start 안쓰면 순열for (int i = start; i < n; i++) 
			swap(count, i);	
			perm(count + 1);
			swap(count, i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = d.length;// sc.nextInt();
		perm(0);
		System.out.println(cnt);
		sc.close();
	}
}
