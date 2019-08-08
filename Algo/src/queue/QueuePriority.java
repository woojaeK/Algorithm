package queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriority {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);//- 음수붙이면 정렬 순서가 바뀜 반대로
				//Integer.compare(o1[2], o2[2]); 은 다른기준으로 정렬하는것
			}
			});
		pq.offer("홍길동");
		pq.offer("강호동");
		pq.offer("사오정");
		System.out.println(pq);
		while (!pq.isEmpty())
			System.out.println(pq.poll());
		System.out.println();
		
		Queue<String> q = new LinkedList<String>();
		q.offer("홍길동");
		q.offer("강호동");
		q.offer("사오정");
		System.out.println(q);
		while (!q.isEmpty())
			System.out.println(q.poll());

	}
}
