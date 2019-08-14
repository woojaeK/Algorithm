package tree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


	

public class Solution_D4_1231_중위순회_서울9반_김우재 {
	
	public static int N;
	public static String[] s;
	public static StringBuilder sb;
	
	public static void inorder(int i){
		if(i <= N && s[i] != "") {
			inorder(2*i);
			sb.append(s[i]);
			inorder(2*i+1);
		}
	}
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D4_1231.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int tc = 1; tc <= 10; tc++) {
			N = Integer.parseInt(br.readLine());
			sb =new StringBuilder();
			s = new String[N+1];
			for (int i = 1; i <=N; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				s[i] = st.nextToken();
			}
			inorder(1);
			System.out.println("#" + tc +" "+sb);
		}
	}

}
