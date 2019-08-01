import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution{
	
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("res/input.txt"));
		//Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//바이트  스트림을 캐릭터  스트림으로 바꿈
		String line = br.readLine();
		String[] sa = line.split(" ");
		int T = Integer.parseInt(sa[0]);

		for(int tc= 1; tc <= T; tc++)
		{
			//T=sc.nextInt();
			//이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			System.out.println("#"+tc);
		}
	}
}