package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_1157_단어공부_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		s= s.toUpperCase();
		ArrayList<Character> c = new ArrayList<>();
		ArrayList<Character> c2 = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			c.add(s.charAt(i));
		}

		for (int i = 0; i < c.size(); i++) {
			if(!c2.contains(c.get(i))) {
				c2.add(c.get(i));
			}
		}
		
		int[] dab = new int[c2.size()];
		for (int i = 0; i < c.size(); i++) {
			for (int j = 0; j < c2.size(); j++) {
				if(c.get(i) == c2.get(j)) {
					dab[j]++;
				}
			}
		}
		int max = -1;
		int aaa = 0;
		boolean asd = false;
		for (int i = 0; i < dab.length; i++) {
			if(max < dab[i]) {
				max = dab[i];
				aaa = i;
			}
		}

		for (int i = 0; i < dab.length; i++) {
			if(dab[aaa] == dab[i] && i != aaa) {
				asd = true;
			}
		}
		if(asd) {
			System.out.println("?");
		}else {
			System.out.println(c2.get(aaa));
		}
	}
}
