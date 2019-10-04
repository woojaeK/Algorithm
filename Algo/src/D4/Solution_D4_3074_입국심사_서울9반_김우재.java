package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D4_3074_입국심사_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		 System.setIn(new FileInputStream("res/D4_3074_input.txt"));
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st;
		 
		 int T = Integer.parseInt(br.readLine());
		 for (int tc = 1; tc <=T; tc++) {
			
			 st= new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] t = new int[N];
			
			for (int i = 0; i < N; i++) {
				t[i] = Integer.parseInt(br.readLine()); 
			}
			
			Arrays.sort(t);
			
		}
	}
}
