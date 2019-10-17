package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_14891_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] circle = new int[4][8];
		
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 8; j++) {
				circle[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int cnt = Integer.parseInt(br.readLine());
		
		int[][] roll = new int[cnt][2];
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				roll[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < cnt; i++) {
			int a = roll[i][0];
			if(a == 0) {
				
			}else if(a == 1) {
				
			}else if(a == 2) {
				
			}else if(a == 3) {
				
			}
		}
	}
}
