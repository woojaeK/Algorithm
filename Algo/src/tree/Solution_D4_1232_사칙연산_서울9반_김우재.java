package tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class Solution_D4_1232_사칙연산_서울9반_김우재{
	public static ArrayList<String> al ;
	public static String[] s;
	public static int[] num1;
	public static int[] num2;
	public static int N;
	public static Stack<Double> stack = new Stack<Double>();
	
	public static void postorder(int i) {
		if( i<= N && s[i] != null&&(2*i+1)<=N) {
			if(num1[2*i] !=0)postorder(num1[2*i]);
			if(num2[2*i+1] != 0)postorder(num2[2*i+1]);
			al.add(s[i]);
		}
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D4_1232.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for(int tc = 1; tc<=1; tc++) {
			N = Integer.parseInt(br.readLine());
			s = new String[N+1];
			al = new ArrayList<>();
			num1 = new int[N+1];
			num2 = new int[N+1];
			for(int i=1; i<=N; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				s[i] = st.nextToken();
				if(st.hasMoreTokens()) num1[i] = Integer.parseInt(st.nextToken());
				if(st.hasMoreTokens()) num2[i] = Integer.parseInt(st.nextToken());
			}
			postorder(1);
			System.out.println(al);
			for(int i=0; i<al.size(); i++) {
				String c = al.get(i);
				if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
					double n2 = stack.pop();
					double n1 = stack.pop();
					double nn= 0.0;
					switch(c) {
					case "+": nn = n1+n2; break;
					case "-": nn = n1-n2; break;
					case "*": nn = n1*n2; break;
					case "/": nn = n1/n2; break;
					}
					stack.push(nn);
				}
				else {
					stack.push(Double.parseDouble(c));
				}
			}
			double d = stack.pop();
			int t = (int)d;
			System.out.println("#" + tc + " " +t);
		}
	}
}