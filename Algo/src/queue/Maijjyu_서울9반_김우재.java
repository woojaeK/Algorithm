package queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maijjyu_서울9반_김우재 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] a = new int[N];
		Queue<Integer> q = new LinkedList<Integer>();
		int count = 1;
		int x= 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = 1;
		}
		
		q.offer(1);
		
		while(true){
			System.out.println("사람 수 : " + q.size());
			for (int i = 1; i <= q.size(); i++) {
				System.out.println("사람번호" + i+"사탕수"+ a[i] );	
			}
			x = q.poll();
			N -= a[x];
			System.out.println("현재까지 나눠준 사탕의 수 : "+ (20-N));
			if(N<0) { System.out.println(x); break;}
			q.offer(x);
			a[x]++;
			q.offer(++count);
		}
	}
}
