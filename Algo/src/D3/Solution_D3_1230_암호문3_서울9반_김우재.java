package D3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_D3_1230_암호문3_서울9반_김우재 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_D3_1230.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int tc = 1; tc <= 10; tc++) {
			ArrayList<Integer> num = new ArrayList<>();
			ArrayList<Integer> num2 = new ArrayList<>();

			int L = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < L; i++) {
				num.add(Integer.parseInt(st.nextToken()));
			}

			int CL = Integer.parseInt(br.readLine());

			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int x = 0;
			int y = 0;
			for (int i = 0; i < CL; i++) {
				String s = st2.nextToken();
				switch (s) {
				case "I":
					x = Integer.parseInt(st2.nextToken());
					y = Integer.parseInt(st2.nextToken());
					for (int j = 0; j < y; j++) {
						num2.add(Integer.parseInt(st2.nextToken()));
					}

					for (int j = 0; j < num2.size(); j++) {
						num.add(x+j, num2.get(j));
					}
					x = 0;
					y = 0;
					num2.clear();
					break;
				case "D":
					x = Integer.parseInt(st2.nextToken());
					y = Integer.parseInt(st2.nextToken());
					for (int j = 0; j < y; j++) {
						num.remove(x);
					}
					x = 0;
					y = 0;
					break;
				case "A":
					y = Integer.parseInt(st2.nextToken());
					for (int j = 0; j < y; j++) {
						num2.add(Integer.parseInt(st2.nextToken()));
					}
					for (int j = 0; j < y; j++) {
						num.add(num2.get(j));
					}
					y = 0;
					num2.clear();
					break;
				}
			}
			System.out.print("#" + tc+ " ");
			for (int i = 0; i < 10; i++) {
				System.out.print(" "+num.get(i));
			}
			System.out.println();
		}
	}
}
