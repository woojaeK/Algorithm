package com.basic;
class My{
	int num;
	void go(int num) {
		this.num = ++num;		
	}
}
public class Test {	

	public static void main(String[] args) {
		int num = 10;	
		
		My m = new My();
		m.go(num);
		System.out.println(m.num);
		
	}

}
