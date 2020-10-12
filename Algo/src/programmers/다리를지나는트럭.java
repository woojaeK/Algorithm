package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };

		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		int hap = 0;
		
		for (int t : truck_weights) {
			while(true) {
				
				if(q.isEmpty()) {
					q.offer(t);
					hap += t;
					answer++;
					break;
				} else if(q.size() == bridge_length) {
					hap -= q.poll();
				} else {
					if(hap+t > weight) {
						q.offer(0);
						answer++;
					} else {
						q.offer(t);
						hap += t;
						answer++;
						break;
					}
				}
			}
		}
		
		System.out.println(answer+bridge_length);
		// return answer;
	}
}
