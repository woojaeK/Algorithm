package tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_1233_사칙연산유효성검사_서울9반_김우재 {

	public static Stack<String> stack = new Stack<String>();
	public static Queue<String> queue = new LinkedList<String>();
	public static String[] s;
	public static String[] ccc = { "+", "-", "*", "/" };

	public static void postorder(int node) {
		postorder(2 * node);
		postorder(2 * node + 1);
		queue.offer(s[node]);
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_1233.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());

			s = new String[N + 1];
			for (int i = 1; i <= s.length; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				s[i] = st.nextToken();
				System.out.println(i+"     ");
			}

			postorder(1);
			int dab = 0;
			String a1 = queue.peek();
			if (a1.equals(ccc[0]) || a1.equals(ccc[1]) || a1.equals(ccc[2]) || a1.equals(ccc[3])) {
				dab = 1;
			} else {
				while (!queue.isEmpty()) {

					if (a1.equals(ccc[0]) || a1.equals(ccc[1]) || a1.equals(ccc[2]) || a1.equals(ccc[3])) {
						if (stack.size() == 1) {
							dab = 1;
							break;
						}
						queue.poll();
						stack.pop();
						stack.pop();
						stack.add("1");
					} else {
						queue.poll();
						queue.poll();
						stack.add("1");
						stack.add("1");
					}
				}
			}
			System.out.println(dab);
		}
	}
}
