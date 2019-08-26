package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D6_1266_소수완제품확률_서울9반_김우재 {
	public static int n, r;
	public static int[] ss = {2,3,5,7,11,13,17}; 
	public static double ss2;
	public static double ss3;
	public static double nCr(int n, int r) {
		if(n<r) return 0.0;
		if(r==0) return 1.0;
		return nCr(n-1,r-1) + nCr(n-1,r); 
	}
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D6_1266.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		
		for (int tc = 1; tc <= T; tc++) {
			//ss2 = new double[7];
			ss2 =0;
			ss3=0;
			st = new StringTokenizer(br.readLine());
			double A = (Double.parseDouble(st.nextToken())/100);
			double B = (Double.parseDouble(st.nextToken())/100);
			
			for (int i = 0; i < ss.length; i++) {	
				ss2 += nCr(18,ss[i])*Math.pow(A, ss[i])*Math.pow((1-A),(18-ss[i]));
				ss3 += nCr(18,ss[i])*Math.pow(B, ss[i])*Math.pow((1-B),(18-ss[i]));
			}
			double result = 1.0 - (1.0-ss2)*(1.0-ss3);
			
			System.out.printf("#%d %.6f\n",tc,result);
		}
	}
}
