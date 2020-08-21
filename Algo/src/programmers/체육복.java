package programmers;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int list[] = new int[n];
        for(int i = 0; i < n; i++) list[i]++;
        for(int i = 0; i < lost.length; i++) list[--lost[i]]--;
        for(int i = 0; i < reserve.length; i++) list[--reserve[i]]++;
        
        for(int i = 0; i < n; i++) {
            if(list[i] == 1) continue;
            if(list[i] == 0){
                if(i-1 >= 0 && list[i-1] == 2) {
                    list[i] = 1;
                    list[i-1] = 1;
                    continue;
                }
                if(i+1 < n && list[i+1] == 2) {
                    list[i] = 1;
                    list[i+1] = 1; 
                }
            }
        }
        
        for(int i= 0; i < n; i++) if(list[i] > 0) answer++;
        
        return answer;
    }
}