package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14891_톱니바퀴 {

	public static int Gear[][], rotation, move[][], check[], dir[], dab;
	
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

		rotation = Integer.parseInt(br.readLine());
		move = new int[rotation][2];
		for (int i = 0; i < rotation; i++) {
			st = new StringTokenizer(br.readLine());
			move[i][0] = Integer.parseInt(st.nextToken());
			move[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//현재 상태에서 맞닿은 값 비교 => 배열 ?
		//기준점에서 돌려야하는 톱니바퀴 회전방향 => 배열
		//돌리기 
		//12시 방향 점수 체크 
		dab = 0; 
		
		solution();
	
		System.out.println(dab);
	}

	private static void solution() {
		for (int i = 0; i < rotation; i++) {
			compare(move[i][0], move[i][1]);	
		}
		calculate();
	}
	
	private static void compare(int standard, int count) {
		switch (standard) {
		case 1:
			if(count == 1) plus(standard-1);
			if(count == -1) minus(standard-1);
			
			if(Gear[0][2] != Gear[1][6]) {
				int b = -count;
				if(b == 1) plus(1);
				if(b == -1) minus(1);
				if(Gear[1][2] != Gear[2][6]) {
					int c = -b;
					if(c == 1) plus(2);
					if(c == -1) minus(2);
					if(Gear[2][2] != Gear[3][6]) {
						int d = -c;
						if(d == 1) plus(3);
						if(d == -1) minus(3);
					}
				}
			}
			break;
			
		case 2:
			if(count == 1) plus(standard-1);
			if(count == -1) minus(standard-1);
			
			if(Gear[0][2] != Gear[1][6]) {
				int a = -count;
				if(a == 1) plus(0);
				if(a == -1) minus(0);
			}

			if(Gear[1][2] != Gear[2][6]) {
				int b = -count;
				if(b == 1) plus(2);
				if(b == -1) minus(2);
				if(Gear[2][2] != Gear[3][6]) {
					int c = -b;
					if(c == 1) plus(3);
					if(c == -1) minus(3);
				}
			}
			break;
			
		case 3:
			if(count == 1) plus(standard-1);
			if(count == -1) minus(standard-1);
			
			if(Gear[2][2] != Gear[3][6]) {
				int a = -count;
				if(a == 1) plus(3);
				if(a == -1) minus(3);
			}
			
			if(Gear[2][6] != Gear[1][2]) {
				int b = -count;
				if(b == 1) plus(1);
				if(b == -1) minus(1);
				if(Gear[0][2] != Gear[1][6]) {
					int c= -b;
					if(c == 1) plus(0);
					if(c == -1) minus(0);
				}
			}
			break;
		case 4:
			if(count == 1) plus(standard-1);
			if(count == -1) minus(standard-1);
			
			if(Gear[3][6] != Gear[2][2]) {
				int a = -count;
				if(a == 1) plus(2);
				if(a == -1) minus(2);
				if(Gear[2][6] != Gear[1][2]) {
					int b = -a;
					if(b == 1) plus(1);
					if(b == -1) minus(1);
					if(Gear[0][2] != Gear[1][6]) {
						int c = -b;
						if(c == 1) plus(0);
						if(c == -1) minus(0);
					}
				}
			}
			break;
		default:
			break;
		}
	}
	
	private static void plus(int j) {
			int temp = Gear[j][7];		
			for (int i = 7; i > 0; i--) {
				Gear[j][i] = Gear[j][i-1];				
			}
			Gear[j][0] = temp;
	}
	
	
	private static void minus(int j) {
			int temp = Gear[j][0];
			for (int i = 0; i < 7; i++) {
				Gear[j][i] = Gear[j][i+1];
			}
			Gear[j][7] = temp;
	}
	
	private static void calculate() {
		
		for (int i = 0; i < Gear.length; i++) {
			dab += Gear[i][0] * Math.pow(2, i);
		}
	}
}
