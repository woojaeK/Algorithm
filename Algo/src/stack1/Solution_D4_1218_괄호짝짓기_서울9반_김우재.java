package stack1;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Solution_D4_1218_괄호짝짓기_서울9반_김우재 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_1218.txt"));
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();

			String s = sc.next();

			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '<') {
					stack.push(s.charAt(i));
				} else {
					char dd = s.charAt(i);

					char cc = stack.peek(); //현재

					if (cc == '(' && dd == ')') {
						stack.pop();
					} else if (cc == '[' && dd == ']') {
						stack.pop(); //한칸 아래
					} else if (stack.peek().equals('{') && dd == '}') {
						stack.pop();
					} else if (stack.peek().equals('<') && dd == '>') {
						stack.pop();
					} else {
						break;
					}
				}
			}
			int x = 0;
			if (stack.empty()) {
				x = 1;
			}
			System.out.println("#" + tc + " " + x);
		}
	}
}
