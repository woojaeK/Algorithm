package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_정올_1863_종교_서울9반_김우재 {

	public static int[] p;

	public static int find(int a) {
		if (p[a] == a) return a;
		return  find(p[a]);
	}

	public static void union(int a, int b) {
		int pa = find(a);
		int pb = find(b);
		if (pa < pb) p[pb] = pa;
		else p[pa] = pb;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		p = new int[n+1];
		for (int i = 1; i < n+1; i++) p[i] = i;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			union(a, b);
		}
		int cnt = 0;
		
		for (int i = 1; i < n+1; i++) {
			if(p[i] == i) cnt++;
		}
		System.out.println(cnt);
	}
}
