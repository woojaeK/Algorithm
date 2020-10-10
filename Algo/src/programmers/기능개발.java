package programmers;

import java.util.*;

class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
		// 큐에넣어서 완료되면 삭제 -> 꼐속해서 더해주기 더하고나서 큐에 100이넘는다 빼기 그리고 해당 하는거에 있는거만큼 배열에 넣기

		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q2 = new LinkedList<Integer>();
		Queue<Integer> q3 = new LinkedList<Integer>();
		
		for (int i = 0; i < progresses.length; i++) {
			q.offer(progresses[i]);
			q2.offer(speeds[i]);
		}

		ArrayList<Integer> list = new ArrayList<>();
		while (!q.isEmpty()) {
			int a = q.poll();
			int b = q2.poll();
			int cnt = 1;
			while(a+b<100) {
				cnt++;
				a = a+b;
			}
			q3.offer(cnt);
		}
		int c = q3.poll();
		int cnt2 = 1;
		while(!q3.isEmpty()) {
			int d = q3.peek();
			if(c>=d) {
				cnt2++;
				q3.poll();
			}else {
				list.add(cnt2);
				cnt2=1;
				c = q3.poll();
			}
            if(q3.isEmpty()) list.add(cnt2);
		}
		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		//System.out.println(list);
	    return answer;
    }
}