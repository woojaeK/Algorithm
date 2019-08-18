package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_2331_반복수열 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		String N = st.nextToken();
		int cnt = Integer.parseInt(st.nextToken());

		int index = 0;
		String n = N;
		int sum = 0;
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(Integer.valueOf(n));
		label: while (true) {
			for (int i = 0; i < n.length(); i++) {
				sum += Math.pow(Character.getNumericValue(n.charAt(i)), cnt);
			}
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == sum)
				{
					index = i;
					break label;
				}
					
			}
			n = sum + "";
			list.add(sum);
			sum = 0;
		}
		System.out.println(index);
	}
}
