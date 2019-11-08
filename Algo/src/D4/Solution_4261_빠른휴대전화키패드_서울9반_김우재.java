package D4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_4261_빠른휴대전화키패드_서울9반_김우재 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			String N = st.nextToken();
			int S = Integer.parseInt(st.nextToken());

			String daneo = "";

			st = new StringTokenizer(br.readLine());

			String[] list = new String[10];
			list[2] = "abc";
			list[3] = "def";
			list[4] = "ghi";
			list[5] = "jkl";
			list[6] = "mno";
			list[7] = "pqrs";
			list[8] = "tuv";
			list[9] = "wxyz";

			int sum = 0;
			for (int i = 0; i < S; i++) {
				daneo = st.nextToken();
				int cnt = 0;
				for (int j = 0; j < daneo.length(); j++) {
					boolean chk = false;
					for (int k = 0; k < list[Character.getNumericValue(N.charAt(j))].length(); k++) {
						if (daneo.charAt(j) == list[Character.getNumericValue(N.charAt(j))].charAt(k)) {
							cnt++;
							chk = true;
							break;
						}
					}
					if(!chk) break;
				}
				if(cnt == daneo.length()) sum++;
			}

			System.out.println("#" + tc + " " + sum);
		}
	}
}
