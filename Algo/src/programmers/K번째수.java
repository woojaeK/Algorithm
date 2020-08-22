package programmers;

import java.util.*;

public class K번째수 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		// i는 시작 j는 끝 정렬 후 -> k번째 수가 답
		for (int i = 0; i < commands.length; i++) {
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];
			int n = b - a + 1;
			int[] list = new int[n];
			for (int j = 0; j < n; j++) {
				list[j] = array[a - 1 + j];
			}

			Arrays.sort(list);
			answer[i] = list[c - 1];
		}
		return answer;
	}
}
