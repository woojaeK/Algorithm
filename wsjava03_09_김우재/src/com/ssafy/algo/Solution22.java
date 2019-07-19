package com.ssafy.algo;

import java.util.Arrays;
import java.util.Scanner;

public class Solution22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			
			int N = sc.nextInt();
			int bugnumber = sc.nextInt();
			boolean[][] area = new boolean[N][N];
			int[][] bug = new int[bugnumber][3];
			int count = 0;
			int xy = 0;
			
			for(int i =0; i < bugnumber; i++) {
				for(int j =0; j  < 3; j++) {
					bug[i][j] = sc.nextInt();
				}
			}		
	
			
			System.out.println(Arrays.deepToString(bug));
			
			for(int j=3; j >0; j--) {			
				for(int i =0; i < bugnumber; i++) {

					xy = xy+j;
					
					
					
					for(int k =0; k < bugnumber; k++) {
						if(bug[i][1] ==0 && bug[i][1] ==0) {
							area[bug[i][0]][bug[i][1]]= true;				
						}
						else if(bug[i][0] ==0){
							area[bug[i][0]][bug[i][1]-1]= true;
							bug[i][0]--;
						}
						
						else if(bug[i][1] ==0){
							area[bug[i][0]-1][bug[i][1]]= true;
							bug[i][1]--;
						}
						else{
							area[bug[i][0]-1][bug[i][1]-1]= true;
							bug[i][1]--;
							bug[i][0]--;
						}
					}
					
					
					

					if(bug[i][2] == 1) {
						if(bug[i][0]-xy >= 0 && area[bug[i][0]-xy][bug[i][1]] != true) {
							area[bug[i][0]-xy+j][bug[i][1]] = false;
							area[bug[i][0]-xy][bug[i][1]] = true;
						} else if(bug[i][0]-xy+j >=0){
							area[bug[i][0]-xy+j][bug[i][1]] = false;
							bug[i][2] =5;
						}
					}
					
					if(bug[i][2] == 2) {
						if(bug[i][0]+xy <= N-1 && area[bug[i][0]+xy-j][bug[i][1]] != true) {
							area[bug[i][0]+xy-j][bug[i][1]] = false;
							area[bug[i][0]+xy][bug[i][1]] = true;
						}else if(bug[i][0]+xy-j <= N-1){
							area[bug[i][0]+xy-j][bug[i][1]] = false;
							bug[i][2] =5;
						}
					}
				
					if(bug[i][2] == 3) {
						
						if(bug[i][1]-xy >= 0 && area[bug[i][0]][bug[i][1]-xy] != true) {
							area[bug[i][0]][bug[i][1]-xy] = true;
							area[bug[i][0]][bug[i][1]-xy+j] = false;
						}else if(bug[i][1]-xy+j >= 0){
							area[bug[i][0]][bug[i][1]-xy+j] = false;
							bug[i][2] =5;
						}
					}
				
					if(bug[i][2] == 4) {
						
						if(bug[i][1]+xy <= N-1  && area[bug[i][0]][bug[i][1]+xy] != true) {
							area[bug[i][0]][bug[i][1]+xy-j] = false;
							area[bug[i][0]][bug[i][1]+xy] = true;
						}else if(bug[i][1]+xy-j <= N-1 ){
							area[bug[i][0]][bug[i][1]+xy-j] = false;
							bug[i][2] =5;
						}
					}
				}
				
				for(int i =0; i < bugnumber; i++) {
					if(bug[i][1] ==0 && bug[i][1] ==0) {
						area[bug[i][0]][bug[i][1]]= false;				
					}
					else if(bug[i][0] ==0){
						area[bug[i][0]][bug[i][1]-1]= false;
						bug[i][1]++;
					}
					else if(bug[i][1] ==0){
						area[bug[i][0]-1][bug[i][1]]= false;
						bug[i][0] ++;
					}
					else{
						area[bug[i][0]-1][bug[i][1]-1]= false;
						bug[i][0]++;
						bug[i][1]++;
					}
				}
				
			}
			
			System.out.println(Arrays.deepToString(area));
			
			for(int i =0; i < N; i++) {
				for(int j =0; j  < N; j++) {
					if(area[i][j] == true) count++;
				}
			}
			
			System.out.println("#"+tc+" "+count);
		}
		
	}

}
