package programmers;

class 소수찾기 {
    public int solution(int n) {
        int answer = 0;
        boolean chk[] = new boolean[n+1];
        chk[0] = true; chk[1] = true;
        
        for(int i = 2; i < n+1; i++) {
            if(!chk[i]) {
                int a = 1;
                answer++;
                while(a*i <= n){
                    chk[a*i] = true;
                    a++;
                }
            }
        }
        
        return answer;
    }
}
