package array2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_D4_1210_Ladder1_서울9반_김우재 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/input_d4_1210.txt"));
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			int k = sc.nextInt();
			int[][] ladder = new int[100][100];
			int dx = 0, dy = 0;
			for (int i = 0; i < ladder.length; i++) {
				for (int j = 0; j < ladder.length; j++) {
					ladder[i][j] = sc.nextInt();
					if (ladder[i][j] == 2) {
						dx = i;
						dy = j;
					}
				}
			}
			int[] d = { -1, +1};
			while (true) {
				
				if (dx == 0)
					break;
				
				if (dy + d[0] >= 0 && dy + d[1] < 100) {
					if (ladder[dx][dy + d[0]] == 1) {
						ladder[dx][dy]++;
						dy--;
					} else if (ladder[dx][dy + d[1]] == 1) {
						ladder[dx][dy]++;
						dy++;
					} else {
						ladder[dx][dy]++;
						dx--;
					}
				} else if (dy == 0) { //dy=0일때
					if (ladder[dx][dy + d[1]] == 1) { // 오른쪽칸에 1이 있는지 확인
						ladder[dx][dy]++;
						dy++;
					} else {
						ladder[dx][dy]++;
						dx--;
					}
				} else { //dy=99일때
					if (ladder[dx][dy + d[0]] == 1) { // 왼쪽칸에 1이 있는지 확인
						ladder[dx][dy]++;
						dy--;
					} else {
						ladder[dx][dy]++;
						dx--;
					}
				}
			}
			System.out.println("#" + tc + " " + dy);
		}
		sc.close();
	}
}
