package D2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_D2_1284_수도요금경쟁 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D2_1284.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
				int P = sc.nextInt();
				int Q = sc.nextInt();
				int R = sc.nextInt();
				int S = sc.nextInt();
				int W = sc.nextInt();
				int dab = 0;
			if(W <= R) {
				if(P*W < Q) dab = P*W;
				else dab = Q;
			} else {
				if(P*W < Q+S*(W-R)) dab = P*W;
				else dab = Q+S*(W-R);
			}
			System.out.println("#" + tc + " " + dab);
		}
	}
}
