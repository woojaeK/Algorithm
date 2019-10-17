package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnionFind { //둘이 같은 집합인지를 확인할 때 사용하는 클래스 
	public static class Edge implements Comparable<Edge> {
		int a; //첫번째 간선
		int b; //정점
		int distance; //거리 
		
		Edge(int a, int b, int distance){
			this.a=a;
			this.b=b;
			this.distance=distance;
		}
		
		
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(distance, o.distance);
		}
		
		public String toString() {
			return "(" + a + "," + b +")" + distance;
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
	
	public static boolean findParent(int[] p, int a, int b) {
		a=getParent(p, a);
		b=getParent(p, b);
		if(a==b) return true;
		else 	 return false;		
	}
	
	public static void main(String[] args) {
		int n=7; //정점 7개
		int m = 11; //간선 11개
		List<Edge> v = new ArrayList<Edge>();
		v.add(new Edge(1,7,12));
		v.add(new Edge(1,4,28));
		v.add(new Edge(1,2,67));
		v.add(new Edge(1,5,17));
		v.add(new Edge(2,4,24));
		v.add(new Edge(2,5,62));
		v.add(new Edge(3,5,20));
		v.add(new Edge(3,6,37));
		v.add(new Edge(4,7,13));
		v.add(new Edge(5,6,45));
		v.add(new Edge(5,7,73));
		
		Collections.sort(v);
		for(Edge e : v) {
			System.out.println(e);
		}
		
		
		
		
		
		
		int[] p = new int[n];
		for(int i=0; i<n; i++) p[i]= i; //makeaset 
		
		int sum =0;
		for(int i=0; i<v.size(); i++) {
			if(!findParent(p, v.get(i).a-1, v.get(i).b-1)) {
				System.out.println("->" + v.get(i));
				sum = sum + v.get(i).distance;
				unionParent(p, v.get(i).a-1, v.get(i).b-1);
			}
		}
		System.out.println(sum);
		
		
	}

}
