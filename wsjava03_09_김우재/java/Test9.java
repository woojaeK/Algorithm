package com.basic;


public class Test9 {	

	public static void main(String[] args) {
		int z = 3, y = 2, a = 8, b = 9;
		boolean f = true, g = false;
		
		if(z++ > 3 & ++y < 10 ) {
			a++;
			++b;
		}
			System.out.println(z);//4
			System.out.println(y);//2
			System.out.println(a);//8
			System.out.println(b);//9
		
	}

}
