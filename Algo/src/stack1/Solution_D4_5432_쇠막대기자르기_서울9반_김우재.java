package stack1;

import java.util.Scanner;
import java.util.Stack;
import java.io.FileInputStream;

public class Solution_D4_5432_쇠막대기자르기_서울9반_김우재 {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("res/input_d4_5432.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String s = sc.next();
			int sum = 0;
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '<') {
					stack.push(s.charAt(i));
				} else {
					char n = s.charAt(i);
					char sn = stack.peek(); //현재
					if(sn == '(' && n == ')') {
						if(i > 0 && s.charAt(i-1) != ')') {
							stack.pop();
							sum += stack.size();
						} else {
							stack.pop();
							sum += 1;
						} 
					}  
				}
			}
			System.out.println("#" + tc + " "+ sum);
		}
	}
}