package array2;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},
					 {4,5,6},
					 {7,8,9}};
		

		int n = a.length;		
		int m = a.length;
		
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				if(a[i][j] == 2) {
					int[] di = {-1,-1,0,1,1,1,0,-1};
					int[] dj = {0,1,1,1,0,-1,-1,-1};
					for(int d = 0; d < 8; d++) {
						int ni = i + di[d]; 
						int nj = j + dj[d];
						if(0<=ni && ni < n && 0<=nj && nj <m) {
							System.out.println(a[ni][nj] + " ");
						}
					}
				}
			}
		}
		
		
		
		/*
		int n = a.length;		
		int m = a.length;
		
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				if(a[i][j] == 2) {
					int[][] di = {{-1,-1,0,1,1,1,0,-1},
								{0,1,1,1,-1,0,-1,-1}};
					for(int d = 0; d < 8; d++) {
						int ni = i + di[0][d]; 
						int nj = j + di[1][d];
						if(0<ni && ni < n && 0<=nj && nj <m)
						System.out.println(a[ni][nj] + " ");
					}
				}
			}
		}*/
		
		/*for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				if(a[i][j] == 5) {
					int[][] di = {{-1,-1,0,1,1,1,0,-1},
								{0,1,1,1,-1,0,-1,-1}};
					for(int d = 0; d < 8; d++) {
						int ni = i + di[0][d]; 
						int nj = j + di[1][d];
						
						System.out.println(a[ni][nj] + " ");
					}
				}
			}
		}*/
		
/*
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				if(a[i][j] == 5) {
					System.out.println(a[i-1][j+0] + "");//2
					System.out.println(a[i-1][j+1] + "");//3
					System.out.println(a[i+0][j+1] + "");//6
					System.out.println(a[i+1][j+1] + "");//9
					System.out.println(a[i+1][j+0] + "");//8
					System.out.println(a[i+1][j-1] + "");//7
					System.out.println(a[i+0][j-1] + "");//4
					System.out.println(a[i-1][j-1] + "");//1
					System.out.println();
					
					int[] di = {-1,-1,1,1,0,1,0,-1};
					int[] dj = {0,1,0,1,-1,-1,1,-1};
					for(int d = 0; d < di.length; d++) {
						int ni = i + di[d]; 
						int nj = j + dj[d];
						System.out.println(a[ni][nj] + " ");
					}
				}
			}
		}
*/
		
/*		
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				if(a[i][j] == 5) {
					System.out.println(a[i-1][j+1] + "");//3
					System.out.println(a[i+1][j+1] + "");//9
					System.out.println(a[i+1][j-1] + "");//7
					System.out.println(a[i-1][j-1] + "");//1
					System.out.println();
					
					
					int[] di = {-1,1,1,-1};
					int[] dj = {1,1,-1,-1};
					for(int d = 0; d < di.length; d++) {
						int ni = i + di[d]; 
						int nj = j + dj[d];
						System.out.println(a[ni][nj] + " ");
					}
				}
			}
		}
*/		

/*		
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				if(a[i][j] == 5) {
					System.out.println(a[i-1][j+0] + "");//2
					System.out.println(a[i+0][j+1] + "");//4
					System.out.println(a[i+1][j+0] + "");//6
					System.out.println(a[i+0][j-1] + "");//8
					
					int[] di = {-1,0,1,0};
					int[] dj = {0,1,0,-1};
					for(int d = 0; d < di.length; d++) {
						int ni = i + di[d]; 
						int nj = j + dj[d];
						System.out.println(a[ni][nj] + " ");
					}
				}
			}
		}
*/
		
/*
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				System.out.print(a[j][i] + " ");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				System.out.println(a[i][j + (a[j].length -2*j -1)] + " ");
			}
		}
		
		System.out.println();
		
		int[][] b = new int[a.length][];
		for(int i = 0; i < a.length; i++) {
			b[i] = Arrays.copyOf(a[i], a[i].length);
		}
		for(int[] v: b) System.out.println(Arrays.toString(v));
		for(int i = 0; i < a.length; i++) {
			for(int j =0; j < a[i].length; j++) {
				if(i<j) {
					int T = b[i][j];
					b[i][j] = b[j][i];
					b[j][i] = T;
				}
			}
		}
		for(int[] v:b) System.out.println(Arrays.toString(v));
*/	
		}
}
