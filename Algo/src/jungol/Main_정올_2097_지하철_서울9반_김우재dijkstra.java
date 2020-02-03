package jungol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_정올_2097_지하철_서울9반_김우재dijkstra {

	public static int N, M, map[][], dist[], path[], visit[];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		dist = new int[N];
		path = new int[N];
		visit = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int INF = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) dist[i] = INF;
		dist[1] = 0;
		for (int i = 0; i < N; i++) {
			int minNode = INF, minVal = INF;
			for (int j = 0; j < N; j++) {
				if(visit[j] == 0 && minVal > dist[j]) {
					minNode = j; minVal = dist[j];
				}
			}
			visit[minNode] = 1;
			for (int j = 0; j < N; j++) {
				if(dist[j] > minVal + map[minNode][j]) {
					dist[j] = minVal + map[minNode][j];
					path[j] = minNode;
				}
			}
		}
		
		
	}
}
