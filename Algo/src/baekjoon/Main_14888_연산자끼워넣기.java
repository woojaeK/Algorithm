package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_14888_연산자끼워넣기 {

	public static int n, r, v[], a[], dab;
	public static ArrayList<Character> d;
	public static char[] e;
	public static int max = Integer.MAX_VALUE;
	public static int min = Integer.MIN_VALUE;
	

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		a = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0;
		d = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			int c = Integer.parseInt(st.nextToken());
			sum += c;
			if (c != 0) {
				if (i == 0) {
					for (int j = 0; j < c; j++) {
						d.add('+');
					}
				} else if (i == 1) {
					for (int j = 0; j < c; j++) {
						d.add('-');
					}
				} else if (i == 2) {
					for (int j = 0; j < c; j++) {
						d.add('*');
					}
				} else if (i == 3) {
					for (int j = 0; j < c; j++) {
						d.add('/');
					}
				}
			}
		}
		n = sum;
		r = sum;
		v = new int[sum];
		e = new char[sum];
		Pem(0);
		System.out.println(max);
		System.out.println(min);
		
	}

	public static void Pem(int count) {
		if (count == r) {
			dab = 0;
			switch (e[0]) {
			case '+':
				dab = a[0] +a[1];
				break;
			case '-':
				dab = a[0] -a[1];
				break;
			case '*':
				dab = a[0] *a[1];
				break;
			case '/':
				dab = a[0] /a[1];
				break;
			}
			for (int i = 2; i < e.length; i++) {
				switch (e[i]) {
				case '+':
					dab = dab + a[i];
					break;
				case '-':
					dab = dab - a[i];
					break;
				case '*':
					dab = dab * a[i];
					break;
				case '/':
					if(dab <0) {
						dab = -dab;
						dab = dab / a[i];
						dab = -dab;
					}else {
						dab = dab / a[i];
					}
					break;
				}
			}
			System.out.println(dab);
			if(max < dab) max = dab;
			if(min > dab) min = dab;
			
			return;
		}
		for (int i = 0; i < n; i++) {
			if (v[i] == 0) {
				v[i] = 1;
				e[count] = d.get(i);
				Pem(count + 1);
				v[i] = 0;
			}
		}
	}
}
