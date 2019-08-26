package D4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D4_3289_서로소집합_서울9반_김우재 {
	public static class Edge {
		int a; //첫번째 간선
		int b; //정점
		
		Edge(int a, int b, int distance){
			this.a=a;
			this.b=b;
		}		
	}
	
	public static int getParent(int[] p, int x)	{
		if(p[x] == x) return x;
		else return p[x] = getParent(p, p[x]);
	}
	
	public static void unionParent(int[] p, int a, int b) {
		a=getParent(p, a);
		b=getParent(p, b);
		if(a<b) p[b] = a; 
		else 	p[a] = b;
	}
	
	public static int findParent(int[] p, int a, int b) {
		a=getParent(p, a);
		b=getParent(p, b);
		if(a==b) return 1;
		else 	 return 0;		
	}

	public static int N,M;
	public static int a,b,c;
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_D4_3289.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			System.out.print("#" + tc + " ");
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			int[] p = new int[N];
			for (int i = 0; i < N; i++) p[i] = i;

			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				c = Integer.parseInt(st.nextToken());
				if (a == 0) {
					unionParent(p, b - 1, c - 1);
				} else {
					System.out.print(findParent(p, b - 1, c - 1));
				}
			}
			System.out.println();
		}
	}

}
