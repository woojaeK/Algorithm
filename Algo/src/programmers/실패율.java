package programmers;

import java.util.*;

class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
		int[] success = new int[N + 1];
		int[] all = new int[N + 1];
		for (int i = 0; i < all.length; i++)
			all[i] = stages.length;
		for (int i = 0; i < stages.length; i++) {
			success[stages[i] - 1]++;
			for (int j = stages[i]; j < N + 1; j++) {
				all[j]--;
			}
		}
		double[] list = new double[N];
		double[] list2 = new double[N];
		boolean[] chk = new boolean[N];
		for (int i = 0; i < list.length; i++) {
			if (success[i] != 0) {
				list[i] = (double) success[i] / (double) all[i];
				list2[i] = (double) success[i] / (double) all[i];
			}
			else {
				list[i] = 0;
				list2[i] = 0;
			}
		}
		
		Arrays.sort(list);
		
		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < N; j++) {
				if (list[i] == list2[j] && !chk[j]) {
					answer[N-i-1] = j+1;
					chk[j] = true;
					break;
				}
			}
		}
		return answer;
    }
}