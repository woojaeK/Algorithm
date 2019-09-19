import java.util.Arrays;

public class test2 {
	public static void main(String[] args) {
		int[] a = { 3, 2, 6, 4, 5, 1 };
		int n = a.length;

		int[] c = new int[n + 1];
		int k = 1;
		c[k] = a[0];
		for (int i = 0; i < n; i++) {
			if (c[k] < a[i]) {
				
				c[++k] = a[i];
			} else {
				int start = 1;
				int end = k;
				while (start < end) {
					int mid = (start + end) / 2;
					if (c[mid] >= a[i])
						end = mid;
					else
						start = mid + 1;
				}
				c[end] = a[i];
			}
		}
		System.out.println(k); // 배열에서 최댓값 구하는 법
		System.out.println(Arrays.toString(c));
	}

}
