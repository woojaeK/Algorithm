package array2;

import java.util.Arrays;
import java.util.Scanner;

//조합 nCr = nPr/r! 5C3 = 5P3/3! = 5*4*3/3*2*1 =10 서로 다른 n개의 대상 가운데 r개를 선택하는 경우의 수
// (flag&(1<<i)) flag 는 0 이고 1<<i 는 해당 자리 숫자 고 둘이 0이어야 0이 나오는데 같으면 사용안한거임그래서 중복을 제외하고 체크
public class Combination2 {
	public static int n, r, cnt, a[];
	
	public static void Combination(int start, int flag, int count) {
		if(count == r ) {
			cnt++;
			System.out.println(Arrays.toString(a));
			return;
		}
		for (int i = start; i <=n; i++) {
			if((flag&(1<<i))==0) {
				a[count] = i;
				Combination(i+1, flag&(1<<i), count+1);	
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 5;//sc.nextInt();
		r = 3;//sc.nextInt();
		a = new int[r];
		Combination(1, 0, 0);
		System.out.println(cnt);
		sc.close();
	}

}
