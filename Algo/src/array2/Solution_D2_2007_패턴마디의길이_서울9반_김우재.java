package array2;
import java.util.Scanner;
import java.io.FileInputStream;
public class Solution_D2_2007_패턴마디의길이_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_d2_2007.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		  sc.nextLine();
		for(int tc= 1; tc <= T; tc++)
		{
			String text = sc.nextLine();
			
			StringBuilder t = new StringBuilder(text);
			
			int y=0;
			label:
			for (int i = 0; i < t.length(); i++) {
				for (int j = 1; j < t.length(); j++) {
					if(t.charAt(i) == t.charAt(j)) {
							y= j;
							if(t.substring(0,y).equals(t.substring(y, y*2))) {
								y=j;
								break label;	
							}
						}
					}
				}				
			System.out.println(y);
			System.out.println("#"+tc +  " " );
		}

	}

}