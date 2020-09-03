package programmers;

public class 최대공약수와최소공약수 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];

		int a = gcd(n, m);
		answer[0] = a;
		answer[1] = n * m / a;

		return answer;
	}

	private static int gcd(int n, int m) {
		if (m == 0)
			return n;
		else
			return gcd(m, n % m);
	}
}
