package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Maijjyu {

	public static void main(String[] args) {
		Queue<int[]> q = new LinkedList<>();
		int num = 1;
		int cnt = 20;
		int tot = 0;
		int[] recv =  null;
		q.offer(new int[] {num,1});
		while(cnt > 0)
		{
			recv = q.poll();
			int su =(recv[1]>cnt)? cnt:recv[1];
			cnt = cnt - su;
			tot = tot + su;
			System.out.println(recv[0] + "번" + su + "개 남은수 : " + cnt);
			recv[1]++;
			q.offer(recv);
			q.offer(new int[]{++num,1});
		}
		System.out.println("마지막 받은 사람=" + recv[0]);
		System.out.println(tot);
	}

}
