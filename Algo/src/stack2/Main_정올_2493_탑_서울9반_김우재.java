package stack2;

import java.util.Scanner;
import java.util.Stack;

public class Main_정올_2493_탑_서울9반_김우재 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Stack<Integer> value = new Stack<>();
		Stack<Integer> index = new Stack<>();

		int a = sc.nextInt();
		value.push(a);
		index.push(0);
		System.out.print("0 ");
		for (int i = 2; i <= N; i++) {
			
			int num = sc.nextInt();
			
			while (!value.isEmpty()) {
				if (num < value.peek()) {
					if(i ==N) {
						System.out.print(index.peek());
						break;
					}
					else {
						System.out.print(index.peek()+ " ");
					break;}
					
				}
				
				value.pop();
				index.pop();
			}	
			if(value.isEmpty()) {
				if(i==N) System.out.print("0");
				else System.out.print("0 ");
			}
			
			value.push(num);
			index.push(i);
				
			
		}
	}
}
