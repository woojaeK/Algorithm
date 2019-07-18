package array1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_D1_1204_최빈수구하기_서울9반_김우재{//제출시 class 명은 반드시 Solution
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T, check, total, a= 0;
		T=sc.nextInt();

		for(int i = 1; i <= T; i++)
		{
			int[] student = new int[1000]; // 학생수
			int[] score = new int[101];
			check = sc.nextInt();
			for(int j = 0; j < student.length; j++) {
				student[j] = sc.nextInt();
				for(int k = 0; k<score.length; k++) {
					if(student[j] == k) {
						score[k]++;
					}
				}
			}

			total = score[0];

			for(int s = 1; s <score.length - 1; s++) {
				if(total <= score[s]) {
					total = score[s];
					a = s;
				}
			}

			System.out.println("#" + check + " " + a);
		}
	}
}

