package queue;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_D3_1225_암호생성기_서울_9반_김우재 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D3_1225.txt"));
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int T = sc.nextInt();
			Queue<Integer> q = new LinkedList<Integer>();
			int[] a = new int[8];

			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
				q.offer(a[i]);
			}
			
			int x = 1;
			
			label: while (true) {
				for (int i = 1; i <= 5; i++) {
					if (x <= 0)break label;
					x = q.poll();
					x -= i;
					q.offer(x);
				}
			}
			
			for (int i = 0; i < 8; i++) {
				a[i] = q.poll();
			}
			
			a[7] = 0;
			System.out.print("#"+ T + " ");
			for (int i = 0; i < a.length; i++) {
				if(i == 7) System.out.print(a[i]);
				else System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}

}
