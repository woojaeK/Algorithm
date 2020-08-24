package programmers;

import java.util.ArrayList;

public class 같은숫자는싫어 {
	public static void main(String[] args) {
		int[] arr = {1,2};

		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) if(arr[i-1] != arr[i]) list.add(arr[i]);
    
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        //return answer;
	}
}
