package samsung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_3190_뱀 {

	public static int N, K, L, map[][];
	
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
         
        /*
        	종료 조건 : 벽에 부딪히거나 자기자신의 몸과 부딪힐경우
        	크기 : N, 사과의 개수 K, 첫번째 행 두번째 열  변환 횟수 L x초뒤 L은 왼쪽 R은 오른쪽 90도 방향
        */
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());
        map = new int[N][N];
        
        for (int i = 0; i < N; i++) {
			
		}
    }
}