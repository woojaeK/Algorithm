package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Solution_D3_1244_최대상금_서울9반_김우재 {
	public static int[] ss;
	static StringBuilder sb;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();
	static HashSet<Integer> list3;
	static String N;
	static boolean how;

	public static void search(int abc) {
		String temp = abc + "";
		int[] ss1 = new int[N.length()];
		for (int i = 0; i < temp.length(); i++) {
			ss1[i] = Character.getNumericValue(temp.charAt(i));
		}
		int tmp = 0;
		for (int i = 0; i < ss1.length - 1; i++) {
			for (int j = i; j < ss1.length - 1; j++) {
				tmp = ss1[i];
				ss1[i] = ss1[j + 1];
				ss1[j + 1] = tmp;
				sb = new StringBuilder();
				for (int k = 0; k < ss1.length; k++) {
					sb.append(ss1[k]);
				}
				if (how)
					list2.add(Integer.parseInt(sb.toString()));
				else
					list.add(Integer.parseInt(sb.toString()));
				tmp = ss1[i];
				ss1[i] = ss1[j + 1];
				ss1[j + 1] = tmp;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D3_1244.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= 10; tc++) {
			how = true;
			st = new StringTokenizer(br.readLine());
			N = st.nextToken();
			int count = Integer.parseInt(st.nextToken());

			String sa = "";
			for (int l = 0; l < count; l++) {
				if (l == 0)
					search(Integer.valueOf(N));
				else {
					if (!how) {
						for (int i = 0; i < list2.size(); i++) {
							search(list2.get(i));
						}
					} else {
						for (int i = 0; i < list.size(); i++) {
							search(list.get(i));
						}
					}
					if (!how) {
						list3 = new HashSet<Integer>(list);
						list = new ArrayList<Integer>(list3);
						list2.clear();
					}
					else {
						list3 = new HashSet<Integer>(list2);
						list = new ArrayList<Integer>(list3);
						list.clear();
					}
				}
				how = !how;
			}
			int max = -1;
			if (!how) {
				for (int i = 0; i < list2.size(); i++) {
					if (max < list2.get(i))
						max = list2.get(i);
				}
			}else {
				for (int i = 0; i < list.size(); i++) {
					if (max < list.get(i))
						max = list.get(i);
				}
			}
			System.out.println("#" + tc + " " + max);
			list.clear();
			list2.clear();
		}
	}
}
