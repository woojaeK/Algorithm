package D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_D3_4406_모음이보이지않는사람_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		int T = Integer.parseInt(br.readLine());
		ArrayList<Character> list = new ArrayList<>();
		list.add('a'); list.add('e'); list.add('i'); list.add('o'); list.add('u');
		
		for (int tc = 1; tc < T; tc++) {
			String s= br.readLine();
			sb = new StringBuilder();
			sb.append("#"); sb.append(tc); sb.append(" ");
			for (int i = 0; i < s.length(); i++) {
				if(!list.contains(s.charAt(i))) {
					sb.append(s.charAt(i));
				}
			}
			
			System.out.println(sb);
		}
		
	}
}
