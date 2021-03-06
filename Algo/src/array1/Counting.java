package array1;

import java.util.Arrays;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,4,1,3,1,2,4,1};
		int m = Arrays.stream(a).max().getAsInt();
		int[] c = new int[m+1];
		int[] s = new int[a.length];
		
		for(int i=0; i<a.length; i++) c[a[i]]++;
		
		for(int i=1; i<c.length; i++) c[i] = c[i] + c[i-1];
		
		for(int i = 0; i < s.length; i++)
		{
			c[a[i]]--;
			s[c[a[i]]] = a[i];
		}
		
		System.out.println(m + " "+ Arrays.toString(s));
		
	}

}
