/*
package D4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution_D4_151_하나로 {
public static Edge[] EdgeArr;
public static int EdgeCnt;
public static int N;
long INF = Long.MAX_VALUE;
int[] ArrX;
int[] Arry;
double E;
long[][] Graph;
public static class Edge{
	int u;
	int v;
	
}
public static void makeGraph() {
	EdgeCnt= 0;
	for (int i = 0; i < N; i++) {
		
	}
}
public static int findset(int v) {
	
}
public static long Kruskal() {
	Arrays.sort(EdgeArr, new Comparator<Edge>() {

		@Override
		public int compare(Edge o1, Edge o2) {
			return Long.compare(o1.cost, o2.cost);
		}
	});
	
	for (int i = 0; i < Nl i++) {
		Parent[i]= i;
	}
	long sumCost=0;
	long selectCnt=0;
	for (int i = 0;i < EdgeCnt; i++) {
		int u = EdgeArr[i].u;
		int v = EdgeArr[i].v;
		if(findSet(u) == findSet(v)) continue;
		
		Parent[findSet(u)] = findSet(v);
		
		sumCost += EdgeArr[i].cost;
	}
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1; tc <=T; tc++) {
			
		}
	}
}
*/