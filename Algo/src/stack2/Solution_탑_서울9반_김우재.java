package stack2;

import java.util.Scanner;
import java.util.Stack;

public class Solution_탑_서울9반_김우재 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		int max = 0;
		int curr = 0;
		int size = 0;
		stack.push(sc.nextInt());
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			stack.push(a);
			
		}
	}
}
