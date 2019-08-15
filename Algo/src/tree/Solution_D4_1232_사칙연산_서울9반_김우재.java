package tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class Node1 {
	String data;
	Node left, right;

	public Node makeTree( String data, Node left, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
}

public class Solution_D4_1232_사칙연산_서울9반_김우재 {

	public static int N;
	public static ArrayList<Node1> node;
	public static Queue<String> queue = new LinkedList<String>();
	public static Stack<Integer> stack = new Stack<Integer>();

	public void postorder(Node1 node) {
		if (node != null) {
			postorder(node.left);
			postorder(node.right);
			queue.add(node.data);
		}
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_1232.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int tc = 1; tc <= 10; tc++) {
			N = Integer.parseInt(br.readLine());
			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				if(st.countTokens() == 1) {node.add(st.nextToken(),0,0);}
				else if (st.countTokens() ==2){}
				else {}
			}
			postorder(1);
			System.out.println(queue);
			while (!queue.isEmpty()) {
				String str = queue.poll();
				if (str.equals(cal[0]) || str.equals(cal[1]) || str.equals(cal[2]) || str.equals(cal[3])) {
					b = stack.pop();
					a = stack.pop();
					sum = 0;
					switch (str.charAt(0)) {
					case '+':
						sum = a + b;
						break;
					case '-':
						sum = a - b;
						break;
					case '*':
						sum = a * b;
						break;
					case '/':
						sum = a / b;
						break;
					}
					stack.push(sum);
				} else {
					stack.push(Double.parseDouble(str));
				}
			}

			System.out.println("#" + tc + " " + stack.pop());
		}
	}
}
