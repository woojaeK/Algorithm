package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution_5658_보물상자비밀번호 {

	public static int N, K, A = 10, B = 11, C = 12, D = 13, E = 14, F = 15;
	public static String S, s;
	public static ArrayList<String> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			S = br.readLine();
			list = new ArrayList<>();
			s = "";
		
			System.out.println("#" + tc + " " );
		}
	}
}
