package D4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Solution_D4_4050_재관이의대량할인_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			Integer[] price = new Integer[N];
			int total = 0;
			for (int i = 0; i < N; i++) {
				price[i] = Integer.parseInt(st.nextToken());
				total += price[i];
			}
			int cnt = 0;
			int sum = 0;
			Arrays.sort(price, Collections.reverseOrder());
			for (int i = 0; i < price.length; i++) {
				if(i%3 == 2) {
					sum += price[i];
				}
			}
			System.out.println("#" + tc + " " + (total - sum));
		}
	}
}
