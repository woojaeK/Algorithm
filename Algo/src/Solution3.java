import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution3 {
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/sample_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= 1; tc++) {
			int N = Integer.parseInt(br.readLine());

			ArrayList<int[]> list = new ArrayList<>();
			ArrayList<Integer> bomb = new ArrayList<>();
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				int e = Integer.parseInt(st.nextToken());
				list.add(new int[] { x, y, d, e });
			}
			
			for (int k = 0; k < list.size(); k++) {
				switch (list.get(k)[2]) {
				case 0:
					label: for (int i = 0; i < list.size(); i++) {
						if(list.get(i)[1] > list.get(k)[1]) {
							int x1 = list.get(k)[0];
							int y1 = list.get(k)[1];
							int x2 = list.get(i)[0];
							int y2 = list.get(i)[1];
							int d2 = list.get(i)[2];
							if(x1 ==x2) {
								if(d2 == 1) {
									bomb.add(list.get(k)[3]);
									break label;
								}
							}
							else {
								if(d2 == 2) {
									if(x1<x2) {
										if(Double.compare(-1.0, (y2-y1)/(x2-x1))==0||Double.compare(1, (y2-y1)/(x2-x1))==0) {
											bomb.add(list.get(k)[3]);
											break label;
										}
									}
								}
								if(d2 == 3) {
									if(x1>x2) {
										if(Double.compare(-1.0, (y2-y1)/(x2-x1))==0||Double.compare(1, (y2-y1)/(x2-x1))==0) {
											bomb.add(list.get(k)[3]);
											break label;
										}
									}
								}
							}
						}
					}
					break;
				case 1:
					label: for (int i = 0; i < list.size(); i++) {
						if(list.get(i)[1] < list.get(k)[1]) {
							int x1 = list.get(k)[0];
							int y1 = list.get(k)[1];
							int x2 = list.get(i)[0];
							int y2 = list.get(i)[1];
							int d2 = list.get(i)[2];
							if(x1 ==x2) {
								if(d2 == 0) {
									bomb.add(list.get(k)[3]);
									break label;
								}
							}
							else {
								if(d2 == 2) {
									if(x1<x2) {
										if(Double.compare(-1.0, (y2-y1)/(x2-x1))==0||Double.compare(1, (y2-y1)/(x2-x1))==0) {
											bomb.add(list.get(k)[3]);
											break label;
										}
									}
								}
								if(d2 == 3) {
									if(x1>x2) {
										if(Double.compare(-1.0, (y2-y1)/(x2-x1))==0||Double.compare(1, (y2-y1)/(x2-x1))==0) {
											bomb.add(list.get(k)[3]);
											break label;
										}
									}
								}
							}
						}
					}
					break;
				case 2:
					label: for (int i = 0; i < list.size(); i++) {
						if(list.get(k)[0] > list.get(i)[0]) {
							int x1 = list.get(k)[0];
							int y1 = list.get(k)[1];
							int x2 = list.get(i)[0];
							int y2 = list.get(i)[1];
							int d2 = list.get(i)[2];
							if(y1 ==y2) {
								if(d2 == 3) {
									bomb.add(list.get(k)[3]);
									break label;
								}
							}
							else {
								if(d2 == 1) {
									if(y1<y2) {
										if(Double.compare(-1.0, (y2-y1)/(x2-x1))==0||Double.compare(1, (y2-y1)/(x2-x1))==0) {
											bomb.add(list.get(k)[3]);
											break label;
										}
									}
								}
								if(d2 == 0) {
									if(y1>y2) {
										if(Double.compare(-1.0, (y2-y1)/(x2-x1))==0||Double.compare(1, (y2-y1)/(x2-x1))==0) {
											bomb.add(list.get(k)[3]);
											break label;
										}
									}
								}
							}
						}
					}
					break;
				case 3:
					label: for (int i = 0; i < list.size(); i++) {
						if(list.get(k)[0] < list.get(i)[0]) {
							int x1 = list.get(k)[0];
							int y1 = list.get(k)[1];
							int x2 = list.get(i)[0];
							int y2 = list.get(i)[1];
							int d2 = list.get(i)[2];
							if(y1 == y2) {
								if(d2 == 2) {
									bomb.add(list.get(k)[3]);
									break label;
								}
							}
							else {
								if(d2 == 1) {
									if(y1<y2) {
										if(Double.compare(-1.0, (y2-y1)/(x2-x1))==0||Double.compare(1, (y2-y1)/(x2-x1))==0) {
											bomb.add(list.get(k)[3]);
											break label;
										}
									}
								}
								if(d2 == 0) {
									if(y1>y2) {
										if(Double.compare(-1.0, (y2-y1)/(x2-x1))==0||Double.compare(1, (y2-y1)/(x2-x1))==0) {
											bomb.add(list.get(k)[3]);
											break label;
										}
									}
								}
							}
						}
					}
					break;
				}
			}
			int sum =0;
			for (int i = 0; i < bomb.size(); i++) {
				sum += bomb.get(i);
			}
			System.out.println("#" + tc + " " +sum);
		}
	}
}