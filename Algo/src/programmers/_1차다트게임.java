package programmers;

import java.util.*;

class _1차다트게임{
    public int solution(String dartResult) {
        int answer = 0;
		int chk = 0;
		int num = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Boolean> list2 = new ArrayList<>();
		boolean d = false;
		for (int i = 0; i < dartResult.length(); i++) {
			char word = dartResult.charAt(i);
			int n = Character.getNumericValue(word);
			System.out.println(n);
			
			if(n == 1) {
				if(dartResult.charAt(i+1) == '0') {
					num = 10;
					d = true;
					continue;
				}
			}
			if (n >= 0 && n < 11 && !d) {
				num = n;
			} else {
				if (word == 'S') {
					list.add(num);
					list2.add(true);
					d=false;
				}
				if (word == 'D') {
					num = num*num;
					list.add(num);
					list2.add(true);
					d=false;
				}
				if (word == 'T') {
					num = num*num*num;
					list.add(num);
					list2.add(true);
					d=false;
				}
				if (word == '*') {
					if(list.size() > 1) {
						int a = list.get(list.size()-1);
						int b = list.get(list.size()-2);
						list.set(list.size()-1, a*2);
						list.set(list.size()-2, b*2);
					} else {
						int a = list.get(list.size()-1);
						list.set(list.size()-1,a*2);
					}
					
				}
				if (word == '#') {
					list2.set(list.size()-1, false);
				}

			}
		}
		for (int i = 0; i < list2.size(); i++) {
			int a = list.get(i);
			if(list2.get(i)) answer += a;
			else answer -= a;
		}

		return answer;
    }
}