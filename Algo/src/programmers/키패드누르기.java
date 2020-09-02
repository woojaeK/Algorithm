package programmers;

import java.util.*;

class 키패드누르기 {
    
    public String solution(int[] numbers, String hand) {
	
		if (hand.equals("right"))
			hand = "R";
		if (hand.equals("left"))
			hand = "L";
		String answer = "";
		
		int l1 = 3, l2 = 0, r1 = 3, r2 = 2;
		for (int i = 0; i < numbers.length; i++) {
			String s = Integer.toString(numbers[i]);
			if (s.equals("1")) {
				answer += "L";
				l1 = 0;
				l2 = 0;
			}
			if (s.equals("4")) {
				answer += "L";
				l1 = 1;
				l2 = 0;
			}
			if (s.equals("7")) {
				answer += "L";
				l1 = 2;
				l2 = 0;
			}
			if (s.equals("3")) {
				answer += "R";
				r1 = 0;
				r2 = 2;
			}
			if (s.equals("6")) {
				answer += "R";
				r1 = 1;
				r2 = 2;
			}
			if (s.equals("9")) {
				answer += "R";
				r1 = 2;
				r2 = 2;
			}
			if (s.equals("2")) {
				int dir = check(l1, l2, r1, r2, 0, 1);
				switch (dir) {
				case 0:
					answer += hand;
					if (hand.equals("L")) {
						l1 = 0; l2 = 1; 
					}
					if (hand.equals("R")) {
						r1 = 0; r2 = 1;
					}
					break;
				case 1:
					answer += "R";
					r1 = 0; r2 = 1;
					break;
				case 2:
					answer += "L";
					l1 = 0; l2 = 1;
					break;
				default:
					break;
				}
			}
			if (s.equals("5")) {
				int dir = check(l1, l2, r1, r2, 1, 1);
				switch (dir) {
				case 0:
					answer += hand;
					if (hand.equals("L")) {
						l1 = 1; l2 = 1; 
					}
					if (hand.equals("R")) {
						r1 = 1; r2 = 1;
					}
					break;
				case 1:
					answer += "R";
					r1 = 1; r2 = 1;
					break;
				case 2:
					answer += "L";
					l1 = 1; l2 = 1; 
					break;
				default:
					break;
				}
			}
			if (s.equals("8")) {
				int dir = check(l1, l2, r1, r2, 2, 1);
				switch (dir) {
				case 0:
					answer += hand;
					if (hand.equals("L")) {
						l1 = 2; l2 = 1; 
					}
					if (hand.equals("R")) {
						r1 = 2; r2 = 1;
					}
					break;
				case 1:
					answer += "R";
					r1 = 2; r2 = 1;
					break;
				case 2:
					answer += "L";
					l1 = 2; l2 = 1;
					break;
				default:
					break;
				}
			}
			if (s.equals("0")) {
				int dir = check(l1, l2, r1, r2, 3, 1);
				switch (dir) {
				case 0:
					answer += hand;
					if (hand.equals("L")) {
						l1 = 3; l2 = 1; 
					}
					if (hand.equals("R")) {
						r1 = 3; r2 = 1;
					}
					break;
				case 1:
					answer += "R";
					r1 = 3; r2 = 1;
					break;
				case 2:
					answer += "L";
					l1 = 3; l2 = 1;
					break;
				default:
					break;
				}
			}
		}
		//System.out.println("{ 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 }");
		//System.out.println("LRLLLRLLRRL");
		//System.out.println(answer);
		return answer;
	}

	private static int check(int l1, int l2, int r1, int r2, int i, int j) {
		double a = Math.abs(l1 - i) + Math.abs(l2 - j);
		double b = Math.abs(r1 - i) + Math.abs(r2 - j);
		int c = 0;
		if (a > b)
			c = 1;
		else if (a < b)
			c = 2;
		return c;
	}
}
