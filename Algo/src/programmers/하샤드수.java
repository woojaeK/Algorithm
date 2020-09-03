package programmers;

class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int a = x;
        while(x > 0) {
            sum += x%10;
            x /= 10;
        }

        if(a%sum != 0) answer = false;   
        return answer;
    }
}