package jungol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_정올_2577_회전초밥고_서울9반_김우재3 {
	
	public static int N, d, k, c;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); 
		d = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		int max = -1;
		boolean chk = false;
		int[] all = new int[N];
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			all[i] = Integer.parseInt(br.readLine());
			if(all[i] == c) chk = true;
			if(!list.contains(all[i])) {
				list.add(all[i]);
			}
		}
		System.out.println(list);
	}
}
