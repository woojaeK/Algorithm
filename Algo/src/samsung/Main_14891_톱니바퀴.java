package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14891_톱니바퀴 {
	
	public static int circle[][], rotation, move[];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		//3번째 7번쨰 톱니바퀴 비교 그전이 시계면 반시께 반씨계면 시꼐로 돌려버리기
		//구현 해보기
		circle = new int[4][8];
		for (int i = 0; i < 4; i++) {
			String s = br.readLine() ;
			for (int j = 0; j < s.length(); j++) {
				circle[i][j] = Character.getNumericValue(s.charAt(j));
			}
		}
		
		rotation = Integer.parseInt(br.readLine());
		for (int i = 0; i < rotation; i++) {
			
		}
	}
}
