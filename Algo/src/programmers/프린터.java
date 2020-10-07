package programmers;

import java.util.*;

class 프린터 {
	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		
		int answer = 0;
		// 큐에 넣어서 돌리기 현재값이랑 비교
		Queue<Num> q = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++) {
			q.offer(new Num(i, priorities[i]));
		}
		
		boolean flag = false;
		while (!q.isEmpty()) {
			Num a = q.peek();
			boolean chk = false;
			
			for (Num num : q) {
				if(num.pri > a.pri) {
					chk = true;
				}
			}
			
			if(chk) {
				q.offer(q.poll());
			} else {
				if(q.poll().loc == location) {
					answer = priorities.length - q.size();
					break;
				}
			}
		}
		//return answer;
		System.out.println(answer);
	}
}

class Num {
	int loc;
	int pri;

	Num(int loc, int pri) {
		this.loc = loc;
		this.pri = pri;
	}
}