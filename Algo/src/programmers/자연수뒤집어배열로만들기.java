package programmers;

public class 자연수뒤집어배열로만들기 {
	public int[] solution(long n) {

		String a = Long.toString(n);

		int answer[] = new int[a.length()];
		System.out.println(a.length());
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (n % 10);
			n /= 10;
		}
		return answer;
	}
}
