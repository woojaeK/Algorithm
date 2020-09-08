package programmers;

import java.util.*;

class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            budget -= d[i];
            if(budget < 0) break;
            answer++;
        }
        return answer;
    }
}