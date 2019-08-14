package tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution_D4_1232_사칙연산_서울9반_김우재 {
	public static int N;
	public static String[] s;
	public static Queue<String> queue = new LinkedList<>();
	public static void inorder(int i){
		if(i <= N && s[i] != "") {
			inorder(2*i);
			quueu
			inorder(2*i+1);
		}
	}
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D4_1232"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= 10; tc++) {
			N = Integer.parseInt(br.readLine());
			s = new String[N+1];
			for (int i = 1; i <= N ; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				s[i] = st.nextToken();
			}
			
		}
		
	}
}
