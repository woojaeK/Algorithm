package programmers;

import java.util.Arrays;

public class 가운데글자 {
	public String solution(String s) {
		String answer = "";
		if (s.length() % 2 == 1) {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		}
		System.out.println();
		return answer;
	}
}
