package stack1;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_D3_1217_거듭제곱_서울9반_김우재 {

	public static int X(int a,int b) {
		if(b>0) {
			return a*X(a,--b);
		}
		return 1;
	} 
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_d3_1217.txt"));
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(T+ " "+ a + " " + b);
			int sum =0;
			
			if(b%2==0) {
				sum = X(a, b/2);
				sum = sum*sum;
			}else {
				sum = X(a, b/2);
				sum = sum*sum*a;
			}
			System.out.println("#" + T + " " + sum);
		}
	}
}
