package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_14888_연산자끼워넣기_서울9반_김우재 {

	public static int v[], n, r, dab, max, min, number[];
	public static char a[];
	public static ArrayList<Character> list;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		number = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			number[i] = Integer.parseInt(st.nextToken()); 
		}
		
		int[] op = new int[4];
		st = new StringTokenizer(br.readLine());
		int opsum = 0;
		list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			op[i] = Integer.parseInt(st.nextToken());
			opsum += op[i];
			for (int j = 0; j < op[i]; j++) {
				if(i == 0) {list.add('+');}
				if(i == 1) {list.add('-');}
				if(i == 2) {list.add('*');}
				if(i == 3) {list.add('/');}
			}
		}
	
		n = opsum;
		r = opsum;
		a = new char[opsum];
		v = new int[opsum];
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		Perm(0);
		System.out.println(max);
		System.out.println(min);
	}
	private static void Perm(int count) {
		if(count == r) {
			dab = number[0];
			for (int i = 0; i < a.length; i++) {
				switch (a[i]) {
				case '+':
					dab = dab + number[i+1];
					break;
				case '-':
					dab = dab - number[i+1];
					break;
				case '*':
					dab = dab * number[i+1];
					break;
				case '/':
					if(dab <0) {
						dab = -dab;
						dab = dab / number[i+1];
						dab = -dab;
					}else {
						dab = dab / number[i+1];
					}
					break;
				}
			}
			if(max < dab) max = dab;
			if(min > dab) min = dab;
			
			return;
		}
		for (int i = 0; i < n; i++) {
			if(v[i] == 0) {
				v[i] = 1;
				a[count] = list.get(i);
				Perm(count +1);
				v[i] =0;
			}
		}
	}
}