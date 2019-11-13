package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_정올_2577_회전초밥고_서울9반_김우재 {
	
	public static int N, d, k, c, counting[];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); 
		d = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		counting = new int[d+1];
		int[] list = new int[N+k];
		int pivot =0;
		int result =1;
		int currentCount=1;
		counting[c] =1;
		for (int i = 0; i < N; i++) {
			if(i < N) {
				list[i] = Integer.parseInt(br.readLine());
			}
			if(counting[list[i]]++ == 0) currentCount++;
			if(i<k) {
				list[N+i] = list[i];
			}else {
				if(--counting[list[pivot]]==0) currentCount--;
				pivot++;
			}
			result = Math.max(currentCount, result);
			if(result == k+1) break;
		}
		System.out.println(result);
	}
}
