package D2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_D2_1970_쉬운거스름돈_서울9반_김우재 {
	public static int[] don = {50000,10000,5000,1000,500,100,50,10};
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D2_1970.txt"));
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <=T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] cnt = new int[don.length];
			int n =N;
			for (int i = 0; i < don.length; i++) {
				cnt[i] = n/don[i];
				n = N%don[i];
			}
			System.out.println("#"+tc);
			for (int i = 0; i < cnt.length; i++) {
				System.out.print(cnt[i]+" ");
			}
			System.out.println();
		}
	}
}
