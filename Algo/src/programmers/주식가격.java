package programmers;

class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			int a = prices[i];
			for (int j = i; j < prices.length-1; j++) {
				int b = prices[j];
				if(a <= b) answer[i]++;
			     else break;
			}
		}
        return answer;
    }
}