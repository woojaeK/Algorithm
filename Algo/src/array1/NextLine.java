package array1;

import java.util.Arrays;
import java.util.Scanner;

public class NextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		String[] sa = line.split(" ");
		System.out.println(Arrays.toString(sa));
		
		String s = sc.next();
		String s1 = sc.next();		
		String s2 = sc.next();
		System.out.println("["+s1+"]["+s2+"]");
		
	}
}
