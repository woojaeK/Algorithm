package jungol;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main_정올_1370_회의실배정_서울9반_김우재2 {

	public static class Meeting implements Comparable<Meeting>{
		private int num;
		private int start;
		private int end;
		
		Meeting(int num, int start, int end) {
			this.num = num;
			this.start = start;
			this.end = end;
		}
		@Override
		public int compareTo(Meeting o) {
			return Integer.compare(end, o.end);
		}
		
		public String toString() {
			return num+"("+start +","+end+")";
		}
	}
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_jo_1370.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] m = new int[N][3];
		for (int i = 0; i < N; i++) {
			m[i] = new int[] {sc.nextInt(), sc.nextInt(),sc.nextInt()};
		}
		Arrays.sort(m, new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
			return Integer.compare(o1[2],o2[2]);
		}});
		
		List<int[]> li = new ArrayList<>();
		li.add(m[0]);
		for (int i = 1; i < m.length; i++) {
			if(li.get(li.size()-1)[2]<=m[i][1]) li.add(m[i]);
		}
		
		
		System.out.println("#");
		for (int[] meet : li) {
			System.out.println(meet[0] + " ");
		}
		sc.close();
	}
}
