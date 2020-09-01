package programmers;

import java.util.*;

class 이상한문자열만들기 {
    public String solution(String s) {
        String answer = "";
		String[] word = s.split(" ", -1);

		for (int i = 0; i < word.length; i++) {
			String a = word[i];
			for (int j = 0; j < a.length(); j++) {
				String b = Character.toString(a.charAt(j));
				if (j % 2 == 1)	b = b.toLowerCase();
				else b = b.toUpperCase();
				answer += b;
			}
			if (word.length - 1 == i) break;
			else answer += " ";
		}        
        return answer;
    }
}