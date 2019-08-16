package tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_D4_1233_사칙연산유효성검사_서울9반_김우재 {

	public static Stack<String> stack = new Stack<String>();
	public static Queue<String> queue = new LinkedList<String>();
	public static String[] s;
	public static int N;
	public static String[] ccc = { "+", "-", "*", "/" };

	public static void preorder(int node) {
		if(node<=N && s[node] != "") {
		preorder(2 * node);
		queue.offer(s[node]);
		preorder(2 * node + 1);
		}
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_1233.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int tc = 1; tc <= 10; tc++) {
			queue.clear();
			N = Integer.parseInt(br.readLine());

			s = new String[N + 1];

			for (int i = 1; i < s.length; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				s[i] = st.nextToken();
			}
			preorder(1);
			int dab =1;
			String q;
			for (int i = 1; i <= queue.size(); i++) {
				q = queue.poll();
				if(i%2 == 1) {
					if(q.equals(ccc[0])||q.equals(ccc[1])||q.equals(ccc[2])||q.equals(ccc[3])) {
						dab =0; break;
					}
				}
				else {
					if(q.equals(ccc[0])||q.equals(ccc[1])||q.equals(ccc[2])||q.equals(ccc[3])) {
					}else {
						dab =0; break;
					}
				}
			}
			System.out.println("#" + tc +" "+dab);
		}
	}
}
