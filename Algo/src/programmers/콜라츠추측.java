package programmers;

class 콜라츠추측 {
    public int solution(int num) {
        int answer = 0;
        boolean chk = false;
        long num1 = (long)num;
        for(int i = 0; i < 500; i++) {
            if(num1 == 1) {
                answer = i;
                chk = true;
                break;
            }
            if(num1 % 2 == 0){
                num1 = num1 / 2;
            } else {
                num1 = num1 * 3 +1;
            }
        }
        
        if(!chk) answer = -1;
        return answer;
    }
}