package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {
	public static void main(String[] args) {
		String[] answer = {};
		
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		String[][] list = new String[strings.length][2];
		
		for (int i = 0; i < list.length; i++) {
			list[i][0] = strings[i].substring(n, n+1);
			list[i][1] = strings[i];
		}
		
		System.out.println(Arrays.deepToString(list));
		Comparator<String[][]> myComparator = new Comparator<String[][]>() {

			@Override
			public int compare(String[][] o1, String[][] o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
}
