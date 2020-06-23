import java.util.*;

public class 모의고사 {
	 public int[] solution(int[] answers) {
	        int[] answer = {};
	        int[] a = {1,2,3,4,5};
	        int[] b = {2,1,2,3,2,4,2,5};
	        int[] c = {3,3,1,1,2,2,4,4,5,5};
	        int[] cnt = {0,0,0};
	        
	        for(int i = 0; i < answers.length; i++) {
	            if(a[i%5] == answers[i]) cnt[0]++;
	            if(b[i%8] == answers[i]) cnt[1]++;
	            if(c[i%10] == answers[i]) cnt[2]++;
	        }
	            
	        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        if(max == cnt[0]) list.add(1);
	        if(max == cnt[1]) list.add(2);
	        if(max == cnt[2]) list.add(3);
	        
	        answer = new int[list.size()];
	        
	        for(int i = 0; i < answer.length; i++) answer[i] = list.get(i);
	        
	        return answer;
	    }
}
