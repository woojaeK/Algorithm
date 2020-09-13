package brutegreedy;

import java.util.Arrays;
import java.util.Scanner;

//중복 없는 순열nPIr = 5P3 = 5*4*3 = 60 서로 다른 n개의 대상 가운데 r개를 선택해서 나열하는 경우의 수
public class PemComb2 {
	public static int n, r, cnt, a[], v[] = { 1, 2, 3, 4, 5 };

	public static void PemComb(int start, int count) {
		if (count == r) {
			cnt++;
			System.out.println(Arrays.toString(a));
			return;
		}
		for (int i = start; i < n; i++) {//start를 쓰면 조합 start 안쓰면 순열for (int i = start; i < n; i++) 
			if (v[i] == 0) {
				v[i] = 1;
				a[count] = i;
				PemComb(i, count + 1);
				v[i] = 0;// 방문 체크 해주면 중복  x 안해주면 중복
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 5;// sc.nextInt();
		r = 2;// sc.nextInt();
		a = new int[r];
		v = new int[n];
		PemComb(0, 0);
		System.out.println(cnt);
		sc.close();
	}
}
