package array1;

import java.util.Arrays;

public class Array1Test {

	public static void main(String[] args) {
		//1. 선언
		int[] a; //int a[];
		//2. 생성
		a = new int[3];
		//1+2
		int[] b = new int[3];
		//3. 초기화
		b[0] = 10;
		b[1] = 11;
		b[2] = 12;
//		b[3] = 10; //java.lang.ArrayIndexOutofBoundsException : 3
//		b[-1] = 10; //java.lang.ArrayIndexOutofBoundsException : -1
		
		int[] c = {10,11,12};
		int[] d = new int[]{10,11,12};
		//1,2+3
		int[] e;
		//e = {10,11,12};//err;
		e = new int[]{10,11,12};
		
		//4. 출력
		for(int i=0; i <e.length; i++) {
			System.out.println(e[i]);
		}
		for(int v:e) {
			System.out.println(v);
		}
		
		//5.복제
		int[] f = new int[e.length];
		System.arraycopy(e, 0,f, 0,e.length);
//		f = Arrays.copyOf(e, e.length); //위 문장과 동일한 문장
		e[0] = 0;
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
		f = e.clone();
		e[0] = 0;
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(f));
	}

}

