package array2;

public class Sum {

	private static int sum(int n) {
		if(n==1) return 1;
		return n+sum(n-1);
	}		//10 +sun(9)
			//10 + 9 + sum(8)
			//10 + ,,,,,, + sum(2)
	
	private static int fac(int n) {
		if(n==1) return 1;
		return n*fac(n-1);
	}
	
	private static int fibo(int n) {
		if(n < 2) return n;
		else return fibo(n-1) + fibo(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fibo(6));
	}
}
