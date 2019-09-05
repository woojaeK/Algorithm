package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_정올_2634_사냥꾼_서울9반_김우재 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] MX = new int[M];
		int max =-1;
		for (int i = 0; i < M; i++) {
			MX[i] = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<int[]> list = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			int a = 0;
			if(MX[i]-L >0) a =MX[i]-L;
			int b = MX[i]+L;
			list.add(new int[] {MX[i],a,b});
		}
		int cnt =0;
		for (int i = 0; i < N; i++) {
			st =new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int j = 0; j < list.size(); j++) {
				if(list.get(j)[1] < x && list.get(j)[2] > x) {
					if(L >= Math.abs(list.get(j)[0]-y) + x) {
						cnt++;
						break;
					}
				}
			}
		}
		
		System.out.println(N-cnt);
	}
}
