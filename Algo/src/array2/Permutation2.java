package array2;

import java.util.Arrays;
import java.util.Scanner;

//중복 없는 순열nPIr = 5P3 = 5*4*3 = 60 서로 다른 n개의 대상 가운데 r개를 선택해서 나열하는 경우의 수
public class Permutation2 {
	public static int n, r, cnt, a[];
	
	public static void Permutation(int start, int flag, int count) {
		if(count == r ) {
			cnt++;
			System.out.println(Arrays.toString(a));
			return;
		}
		for (int i = 1; i <=n; i++) {
			if((flag&(1<<i))==0) {
				a[count] =i;
				Permutation(i+1,flag|(1<<i),count+1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 5;//sc.nextInt();
		r = 3;//sc.nextInt();
		a = new int[r];
		Permutation(1, 0 ,0);
		System.out.println(cnt);
		sc.close();
	}

}
