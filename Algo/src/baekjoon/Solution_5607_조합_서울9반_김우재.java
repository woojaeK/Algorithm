package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_5607_조합_서울9반_김우재 {

	public static int  N, R;
	public static int P = 7;

	public static long nCr(int n, int r, int p) {
		if(r==0) return 1L;
		
		long[] fac = new long[n+1];
		fac[0] = 1;
		for (int i = 1; i<=n; i++) fac[i] = fac[i-1]*i%p;
		//페르마
		return (fac[n]*power(fac[r],p-2,p)*power(fac[n-r],p-2,p))%p;
	}
	
	private static long modInverse(long a, int p) {
		return power(a,p-2,p);
	}
	
	private static long power(long x, int y, int p) {
		long r = 1L;
		x = x%p;
		//^7 7승이면 7번 곱해야하는데 연산회수 줄이는 방법
		//=> 3^7 > 7 3 1	3^7 --> 3^1*3^2*3^4
		while(y>0) {
			if(y%2 == 1) r = (r*x)%p;
			y = y/2; //y = y>>1; //y = y/2;
			x = (x*x)%p;
		}
		return r;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			
			System.out.println("#" + tc + " " + nCr(N,R,P));
		}
	}
}
