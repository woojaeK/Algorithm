package programmers;

import java.util.*;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        while(true){
            answer += n%10;
            n = n/10;
            if(n == 0) break;
        }

        return answer;
    }
}