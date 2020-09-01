package programmers;

class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        
        int[] answer = {};

		int k = 0;
		int n = arr[k];
		for (int i = 1; i < arr.length; i++) {
			if (n > arr[i]) {
				n = arr[i];
				k = i;
			}
		}
		if (arr.length != 1) {
			answer = new int[arr.length - 1];
			int a = 0;
			for (int i = 0; i < answer.length + 1; i++) {
				if (i != k) {
					answer[a++] = arr[i];
				}
			}
		} else {
			answer = new int[1];
			answer[0] = (-1);
		}
		//System.out.println(Arrays.toString(answer));
		return answer;
    }
}
