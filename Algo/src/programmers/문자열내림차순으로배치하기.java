package programmers;

import java.util.*;

class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";
        String[] list = new String[s.length()];
		list = s.split("");
		Arrays.sort(list, Collections.reverseOrder());
        for(int i = 0; i < s.length(); i++) {
            answer += list[i];
        }
        return answer;
    }
}