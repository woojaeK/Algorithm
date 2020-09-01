package programmers;

import java.util.*;

class 정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        String[] list = s.split("");
        Arrays.sort(list, Collections.reverseOrder());
        s = "";
        for(int i = 0; i < list.length; i++) {
            s +=list[i];
        }
        answer = Long.parseLong(s);
        return answer;
    }
}