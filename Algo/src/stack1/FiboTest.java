package stack1;

public class FiboTest {

	public static int fibo(int n) {

		if (n < 2)
			return n;

		return fibo(n - 1) + fibo(n - 2);

	}

	public static int[] memo;

	public static int fibo1(int n) {

		if (n > 2 && memo[n] == 0) {

			memo[n] = fibo1(n - 1) + fibo1(n - 2);

		}

		return memo[n];

	}

	public static int fibo2(int n) {

		for (int i = 2; i <= n; i++) {

			memo[i] = memo[i - 1] + memo[i - 2];

		}

		return memo[n];

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub\

		long start = System.currentTimeMillis();

		System.out.println(fibo(4));//

		long end = System.currentTimeMillis();

		System.out.println((end - start) + "ms");

		start = System.nanoTime();

		memo = new int[100];

		memo[0] = 0;

		memo[1] = 1;

		System.out.println(fibo(1));//

		end = System.nanoTime();

		System.out.println((end - start) + "ns");

		start = System.nanoTime();

		memo = new int[100];

		memo[0] = 0;

		memo[1] = 1;

		System.out.println(fibo2(40));//

		end = System.nanoTime();

		System.out.println((end - start) + "ns");

	}
}
