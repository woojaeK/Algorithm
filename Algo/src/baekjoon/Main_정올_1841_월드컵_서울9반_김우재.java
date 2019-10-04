package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_정올_1841_월드컵_서울9반_김우재 {

	public static int[] gama, gamb, winn, lose ,draw;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		winn = new int[6];
		lose = new int[6];
		draw = new int[6];
		comb();
		loop: for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < 6; j++) {
				winn[j] = Integer.parseInt(st.nextToken());
				draw[j] = Integer.parseInt(st.nextToken());
				lose[j] = Integer.parseInt(st.nextToken());
			}
			
			for (int j = 0; j < 6; j++) {
				if(winn[j] > 5|| draw[j]>5||lose[j]>5) {
					System.out.print(0+" ");
					continue loop;
				}
			}
			
			System.out.println(dfs(0) + " ");
		}
	}

	public static void comb() {
		gama = new int[15];
		gamb = new int[15];
		int cnt = 0;
		for (int i = 5; i > 0; i--) {
			for (int j = 6-i; j <6; j++) {
				gama[cnt] = 6-1-i;
				gamb[cnt++] = j;
			}
		}
	}
	
	public static int dfs(int n) {
		if(n >= 15) { return 1;}
		int a = gama[n];
		int b = gamb[n];
		
		if(winn[a] != 0 && lose[b] !=0) {
			winn[a]--;
			lose[b]--;
			if((dfs(n+1)) == 1) return 1;
			winn[a]++;
			lose[b]++;
		}
		if(draw[a] != 0 && draw[b] !=0) {
			draw[a]--;
			draw[b]--;
			if((dfs(n+1)) == 1) return 1;
			draw[a]++;
			draw[b]++;
		}
		if(lose[a]!= 0 && winn[b] !=0) {
			lose[a]--;
			winn[b]--;
			if((dfs(n+1)) == 1) return 1;
			lose[a]++;
			winn[b]++;
		}
		return 0;
	}
}
