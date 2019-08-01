package stack2;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Solution_D4_1224_계산기3_서울9반_김우재 {
	public static Stack<Character> stack = new Stack<Character>();
	public static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_d4_1224.txt"));
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			StringBuilder sb = new StringBuilder();
			int N = sc.nextInt();
			String S = sc.next();

			for (int i = 0; i < S.length(); i++) {
				char c = S.charAt(i);
				if (Character.isDigit(c)) {
					sb.append(c - '0');
				} else if (c == ')') {
					char s = '\u0000';
					while ((s = stack.pop()) != '(') {
						sb.append(s);
					}
				} else {// +,-,*,/
					while (getIcp(c) <= getIsp()) {
						sb.append(stack.pop());
					}
					stack.push(c);
				}
			}
			while (!stack.empty()) {//중요 스택이 비어있는지 확인
				sb.append(stack.pop());
			}
			for (int i = 0; i < sb.length(); i++) {
				char c = sb.charAt(i);
				if('0'<=c && c<='9') {
					stack2.push(c-'0');
				}else {
					int n2 = stack2.pop();
					int n1 = stack2.pop();
					int nn = 0;
					switch (c) {
					case '+': nn = n1 + n2; break;
					case '-': nn = n1 - n2; break;
					case '*': nn = n1 * n2; break;
					case '/': nn = n1 / n2; break;
					}
					stack2.push(nn);
				}
			}
			System.out.println("#" + tc + " " +stack2.pop());
		}
	}

	public static int getIcp(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '(':
			return 3;
		default:
			return 0;
		}
	}

	public static int getIsp() {
		char c = stack.empty() ? ' ' : stack.peek();
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '(':
			return 0;
		default:
			return 0;
		}
	}
}
