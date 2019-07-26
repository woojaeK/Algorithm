package array2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_D4_1211_Ladder2_서울9반_김우재 {

	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("res/input_d4_1211.txt"));
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 1; tc++) {
			int k = sc.nextInt();

			int[][] data = new int[100][100];
			int dx = 0, dy = 0;
			int count = 0;
			for (int i = 0; i < data.length; i++) {				
				for (int j = 0; j < data.length; j++) {
					data[i][j] = sc.nextInt();
				}
				if(data[0][i]==1) {
					count++;
				}
			}
				
			int[] start = new int[count];
			int e =0;
			for (int i = 0; i < data.length; i++) {
				if(data[0][i]==1) {
					start[e++] = i;
				}
			}

			int ny=0;
			int nx=0;
			int sum = 0;
			int max = -1;
			int O = 0;
			label: for (int i = 0; i < start.length; i++) {
				ny = start[i];

				while(true) {
					if(max < sum) {
						max = sum;
						O = i;
					}
					
					if(nx == 99) {
						break label;
					}
					
					if ( ny - 1 >= 0 && ny + 1 < 100){
						if (data[nx][ny + 1] == 1) {
							data[nx][ny]++;
							ny++;
							sum++;
						} else if (data[nx][ny - 1] == 1) {
							data[nx][ny]++;
							ny--;
							sum++;
						} else {
							dx++;
							sum++;
						}
					}else if(ny==0) {
						if (data[nx][ny + 1] == 1) {
							data[nx][ny]++;
							ny++;
							sum++;
						}else {
							dx++;
							sum++;
						}
					}else {
						if (data[nx][ny - 1] == 1) {
							data[nx][ny]++;
							ny--;
							sum++;
						} else {
							dx++;
							sum++;
						}
					}
				}

			}
			System.out.println("#" + k +" " + O);
		}
	}
}
