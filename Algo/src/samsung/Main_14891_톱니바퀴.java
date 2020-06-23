package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14891_톱니바퀴 {

	public static int Gear[][], dab;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// 3번째 7번쨰 톱니바퀴 비교 그전이 시계면 반시께 반씨계면 시꼐로 돌려버리기
		Gear = new int[4][8];
		for (int i = 0; i < 4; i++) {
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				Gear[i][j] = Character.getNumericValue(s.charAt(j));
			}
		}

		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			st = new StringTokenizer(br.readLine());
			solution(Integer.parseInt(st.nextToken())-1, Integer.parseInt(st.nextToken()));
		}
		
		dab = 0; 
		calculate();
		System.out.println(dab);
	}

	private static void solution(int start, int dir) {
		left(start-1, -dir);
		right(start+1, -dir);
		rotation(start, dir);
	}
	
	private static void left(int start, int dir) {
		if(start <0) return;
		
		if(Gear[start][2] != Gear[start+1][6]) {
			left(start-1, -dir);
			rotation(start, dir);
		}
	}
	
	private static void right(int start, int dir) {
		if(start > 3) return;
		
		if(Gear[start][6] != Gear[start-1][2]) {
			right(start+1, -dir);
			rotation(start, dir);
		}
	}

	private static void rotation(int start, int dir) {
		if(dir == 1) {
			int temp = Gear[start][7];		
			for (int i = 7; i > 0; i--) {
				Gear[start][i] = Gear[start][i-1];				
			}
			Gear[start][0] = temp;
		} else {
			int temp = Gear[start][0];
			for (int i = 0; i < 7; i++) {
				Gear[start][i] = Gear[start][i+1];
			}
			Gear[start][7] = temp;
		}
	}
	
	private static void calculate() {
		for (int i = 0; i < Gear.length; i++) {
			dab += Gear[i][0] * Math.pow(2, i);
		}
	}
}
