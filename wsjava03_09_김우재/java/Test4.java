package com.basic;

class Super{}
class Moon extends Super{}
class Star extends Super{}

public class Test4 {

	public static void main(String[] args) {
		Super s = new Moon();
		Moon m = (Moon)s;
		
		s = new Star();
		Star t = (Star)s;
		
		s = new Super();
		Star x = (Star)s;
		
	}

}
