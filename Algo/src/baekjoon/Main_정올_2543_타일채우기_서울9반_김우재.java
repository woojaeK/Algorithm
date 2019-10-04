package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_정올_2543_타일채우기_서울9반_김우재 {
	public static int T[][];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		 int N = Integer.parseInt(br.readLine());
		 st = new StringTokenizer(br.readLine());
		 int X = Integer.parseInt(st.nextToken());
		 int Y = Integer.parseInt(st.nextToken());
		 T = new int[N][N];

		 tile(0, 0, N-1, N-1, X, Y, 0);
		 
		 for (int i = 0; i < N; i++) {
			 for (int j = 0; j < N; j++) {
				 System.out.print(T[i][j]);
			}
			 System.out.println();
		}
	}
	
	public static void tile(int si, int sj, int ei, int ej, int hi, int hj, int hv) {
		int mi = (si+ei)/2;
		int mj = (sj+ej)/2;
		if(si == ei) {
			T[si][sj] = hv;
			return;
		}
		if(si<=hi && hi <=mi && sj<=hj&&hj<=mj) {
			tile(si, sj, mi, mj, hi, hj, hv);
			tile(si, mj+1, mi, ej, mi, mj+1, 1);
			tile(mi+1, sj, ei, mj, mi+1, mj, 1);
			tile(mi+1, mj+1, ei,ej,mi+1,mj+1,1);
		}else if(si <=hi&&hi<=mi&&mj+1<=hj&&hj<=ej) {
			tile(si, sj, mi, mj,mi,mj,2);
			tile(si, mj+1, mi, ej,hi,hj,hv);
			tile(mi+1, sj, ei, mj, mi+1, mj,2);
			tile(mi+1, mj+1, ei, ej,mi+1,mj+1,2);
		}else if(mi+1<=hi&&hi<=ei&&sj<=hj&&hj<=mj) {
			tile(si, sj,mi,mj,mi,mj,3);
			tile(si, mj+1,mi,ej,mi,mj+1,3);
			tile(mi+1, sj, ei, mj, hi,hj,hv);
			tile(mi+1, mj+1 , ei, ej, mi+1, mj+1,3);
		}
		else if(mi+1<=hi&&hi<=ei && mj+1 <=hj && hj<=ej) {
			tile(si, sj, mi, mj, mi, mj, 4);
			tile(si, mj+1, mi, ej, mi, mj+1, 4);
			tile(mi+1, sj, ei, mj, mi+1, mj, 4);
			tile(mi+1, mj+1,ei,ej,hi,hj,hv);
		}
	}
}
