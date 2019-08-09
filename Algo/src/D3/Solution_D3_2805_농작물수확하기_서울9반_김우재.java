package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution_D3_2805_농작물수확하기_서울9반_김우재 {
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D3_2805.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] field = new int[N][N];
			
			int[] d = {-1,1};
			int l = field.length;
			int cnt =0;
			for (int i = 0; i < l; i++) {
				String s = sc.next();
				for (int j = 0; j < l; j++) {
					field[i][j] = Integer.parseInt(s.split("")[j]);
				}
			}
			int sum =0;
			for (int i = 0; i < l/2+1; i++) {
				for (int j =0; j <i+1; j++) {
					if(j!=0)sum += field[i][l/2+d[0]*j];
					if(j==0)sum += field[i][l/2];
					if(j!=0)sum += field[i][l/2+d[1]*j];
				}
			}
			for (int i = l/2+1; i < l; i++) {
				for (int j =l/2-1-cnt; j >=0; j--) {
					System.out.println("j : "+j);
					if(j !=0) {
						sum += field[i][l/2+d[0]*j];
					}
					if(j ==0) {
						sum += field[i][l/2];
					}
					if(j !=0) {
						sum += field[i][l/2+d[1]*j];
					}
				}
				cnt++;
			}
			System.out.println("#"+tc+" "+sum);
		}
	}
}
