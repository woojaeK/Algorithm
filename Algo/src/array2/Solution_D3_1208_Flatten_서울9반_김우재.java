package array2;

import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_D3_1208_Flatten_서울9반_김우재{//제출시 class 명은 반드시 Solution
	public static void main(String args[]) throws Exception {
//선생님 풀이
		System.setIn(new FileInputStream("res/input_Flatten.txt"));
		Scanner sc =new Scanner(System.in);
		
		for(int tc = 1; tc <=10; tc ++) {
			int t = sc.nextInt();
			int[] box = new int[100]; 
			
			for(int i = 0; i < box.length; i++) {
				box[i] = sc.nextInt();
			}
			
			Arrays.sort(box);

			for(int i=0; i < t; i++) {
				if(box[0] != box[99]) {
					box[0]++;
					box[99]--;
					Arrays.sort(box);
				}
			}
			
			System.out.println();
			System.out.println("#" + tc + " " + (box[99]-box[0]));
		}
	}
}


