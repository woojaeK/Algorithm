package jungol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_정올_1658_최대공약수와최소공배수_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st =new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int gcd = gcd_get(a,b);
		int lcm = a*b/gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}

	private static int gcd_get(int a, int b) {
		if(b==0) return a;
		return gcd_get(b, a%b);
	}
}
