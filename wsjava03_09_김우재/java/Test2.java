package com.basic;

class Parent{
	void go() {
		System.out.println("one");
	}
}
class Child extends Parent{
	protected void go() {
		System.out.println("two");
	}
}

public class Test2 {
	public static void main(String[] args) {
		Parent p = new Child();
		p.go();
	}
}






