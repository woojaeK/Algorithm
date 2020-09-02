import java.util.Arrays;

class test {
	public static void main(String[] args) {
		
		int q1 =1, q2=3;
		int[] answer = {};
		int[] arr = { 4, 3, 2, 1 };
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
		System.out.println(Arrays.toString(answer));
		// return answer;
	}
}
