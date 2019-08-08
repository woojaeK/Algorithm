package D3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution_D3_3499_퍼펙트셔플_서울9반_김우재 {
	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("res/input_D3_3499.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();

			ArrayList<String> s = new ArrayList<>();
			ArrayList<String> dab = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				s.add(sc.next());
			}
			if (N % 2 == 0) {
				for (int i = 0; i < N / 2; i++) {
					dab.add(s.get(i));
					dab.add(s.get(N / 2 + i));
				}
			} else {
				for (int i = 0; i < N/2; i++) {
					dab.add(s.get(i));
					dab.add(s.get(N / 2 + i+1));
				}

				dab.add(s.get(N/2));
			}
			System.out.print("#" + test_case + " ");
			for (int i = 0; i < dab.size(); i++) {
				if(i == dab.size()-1)System.out.println(dab.get(i));
				else System.out.print(dab.get(i)+" ");
			}
		}
	}
}