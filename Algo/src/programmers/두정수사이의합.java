package programmers;

class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;
        int temp =0;
        if(a > b) {
            temp =b;
            b = a;
            a = temp;
        }
        if(a!=b) for(int i = a; i <= b; i++) answer +=i;
        else answer = a;
        return answer;
    }
}