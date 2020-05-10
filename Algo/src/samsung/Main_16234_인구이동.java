package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class  Main_16234_인구이동 {

	public static int N, L, R, map[][], map2[][];
	public static boolean exit;
	public static ArrayList<int[]> list;
	public static int[] di = {-1, 0, 1, 0};
	public static int[] dj = {0, 1, 0, -1};
	
	public static void main(String[] args) throws Exception{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		/*
		N x N 크기 r행 c열 정사각형
		인구 이동 성공  인접한 국경선 L명 이상 R명이하 모두 열리면 이동 시작
		연한의 인구수 / 연합을 이루고 있는 칸의 개수  소슈점 버림 
		인구 이동 횟수 구하기 
		첫째줄 N L R
		둘째줄 N개의 줄 
		*/
		
		/*
		BFS 탐색 -> 인구 이동 해야한다 -> 해야하는 구역 체크 -> 인구이동 인구 -> 아직 인구이동안한 구역 찾아서 반복
				 -> 인구 이동 할 필요 가 없다 ->  -> 끝내기 
		*/ 
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		map = new int[N][N];
		
		//입력
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int dab = 0;
		//solution start 
		while(true){
			//새로운 구역 인구 이동 표시
			map2 = new int[N][N];
			boolean a = false;

				for(int i=0; i < N; i++){
					for(int j=0; j < N; j++){
						if(map2[i][j]==0 && BFS(i,j)){
							a  = true;
							
						}			
					}
				}
				if(a) dab++;
				else break;  
			}
		System.out.println(dab);
	}

	private static boolean BFS(int sx, int sy) {
		boolean visit[][] = new boolean[N][N];
		Queue<int[]> q = new LinkedList<int[]>();
		list = new ArrayList<>();
		list.add(new int[]{sx, sy});
		q.offer(new int[] {sx, sy});

		while(!q.isEmpty()) {
			int[] curr = q.poll();
			visit[curr[0]][curr[1]] = true;
			
			for (int i = 0; i < 4; i++) {
				int x = curr[0] + di[i];
				int y = curr[1] + dj[i];

				if(x>=0 && y >=0 && x < N && y <N && !visit[x][y]) {
					
					int z = Math.abs(map[curr[0]][curr[1]] - map[x][y]);
					
					if(z >=L && x <=R) {
						list.add(new int[]{x, y});
						exit = true;
					}
					q.offer(new int[] {x,y});
				}
			}


		}
		return exit;
	}
}
