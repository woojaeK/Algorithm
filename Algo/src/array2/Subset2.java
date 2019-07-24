package array2;

public class Subset2 {
	public static int[]  a = {1,2,3,4};
	
	public static void main(String[] args) {
		for (int i = 0; i < (1<<a.length); i++) {
			System.out.println("i=" + Integer.toBinaryString(i));
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				if((i&(1<<j))>0) {
					System.out.print(a[j]+" ");
					sum = sum+a[j];
				}
			}
			System.out.println(" sum="+sum);
		}
	}
}
