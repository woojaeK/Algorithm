import java.util.*;
import java.util.regex.Pattern;

public class a {
		public static int n, r, a[], v[];
		public static ArrayList<String> list;
	    public static void main(String[] args) {
	    	String[] orders = {"XYZ", "XWY", "WXA"};
	    	int[] course = {2,3,4};
	    	
	    	ArrayList<String> answer2 = new ArrayList<String>();
	    	for (int i = 0; i < course.length; i++) {
				n = 0;
				String word = "";
				list = new ArrayList<>();
	    		for (int j = 0; j < orders.length; j++) {
					n = orders[j].length();
					word = orders[j];
					r = course[i];
					if(n >= r) {
						a = new int[r];
						v = new int[n];
						Comb(0, 0, word);
					}
				}
	    		System.out.println(list);
	    		int[] chk = new int[list.size()];
	    		int max = -1;
	    		
	    		for (int j = 0; j < list.size(); j++) {
	    			String dab = list.get(j);
	    			for (int k = j; k < list.size(); k++) {
						if(dab.equals(list.get(k))) {
							chk[j]++;
						}
					}
				}
	    		for (int j = 0; j < chk.length; j++) {
					if(max < chk[j]) max = chk[j];
				}
	    		
	    		for (int j = 0; j < chk.length; j++) {
					if(chk[j] == max && max >1) answer2.add(list.get(j));
				}
			}
	    	
	    	String[] answer = new String[answer2.size()];
	    	for (int j = 0; j < answer.length; j++) {
				answer[j] = answer2.get(j);
			}
	    	Arrays.sort(answer);
	    	System.out.println(Arrays.toString(answer));
	    }
		private static void Comb(int start, int count, String word) {
			if(count == r) {
				String s = "";
				for (int i = 0; i < a.length; i++) {
					s += Character.toString(word.charAt(a[i]));
				}
				list.add(s);
				return;
			}
			for (int i = start; i < n; i++) {
				if (v[i] == 0) {
					v[i] = 1;
					a[count] = i;
					Comb(i, count + 1, word);
					v[i] = 0;
				}
			}
		}
}
