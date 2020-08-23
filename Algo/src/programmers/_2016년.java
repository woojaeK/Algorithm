package programmers;

public class _2016년 {
	public String solution(int a, int b) {
		String answer = "";

		int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int cnt = 0;
		for (int i = 0; i < month.length; i++) {
			if (i == a - 1) {
				cnt += b;
				break;
			} else {
				cnt += month[i];
			}
		}
		cnt--;
		String[] week = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		while (cnt > 7)
			cnt = cnt % 7;
		answer = week[cnt];
		return answer;
	}
}
