package programmers;

class 멀쩡한사각형 {
    public long solution(int w, int h) {
        long answer = 0;
        long lw = (long) w;
        long lh = (long) h;
        long wh = lw*lh;
        
        long cs =((lw+lh) - gcd(lw, lh));
        System.out.println(wh + "   " +cs);
        answer = wh - cs;
        
        return answer;
    }
    
    public long gcd(long w, long h) {
        if(h==0) {
            return w;
        } else {
            return gcd(h, w%h);
        }
    }
}