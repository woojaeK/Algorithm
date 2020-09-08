package programmers;

import java.util.*;

class _1차비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
       String[] answer = new String[n];
        for (int i = 0; i < answer.length; i++) {
			answer[i] ="";
		}
        boolean[][] map = new boolean[n][n];
        
        for(int i = 0; i < n; i++) {
            int a = arr1[i];
            int b = arr2[i];
            for(int j = 0; j < n; j++){
                double c = Math.pow(2,n-j-1);
                if(a >= c) {
                    a -= c;
                    map[i][j] = true;
                }
                if(b >= c) {
                    b -= c;
                    map[i][j] = true;
                }
                if(map[i][j]) answer[i] += "#";
                else answer[i] += " ";
            }
        }
        return answer;
    }
}
