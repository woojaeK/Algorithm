import java.util.Scanner;
import java.io.FileInputStream;

public class Solution{
	
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int tc= 1; tc <= T; tc++)
		{
			//이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			System.out.println("#"+tc);
		}
	}
}