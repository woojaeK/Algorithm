package com.basic;

class  Parent2 {
    int k=5;
    void show() {System.out.println(1); } 
    void down() {System.out.println(2); }
}
class Child2 extends  Parent2 {
    int  k=10; 
    void show() { System.out.println(3);  } 
    void up()  {System.out.println(4);  }
}
public class Test10 {	
	public static void main(String[] args) {
		   Parent2  a = new  Child2();
	          a.show();                          
	          System.out.println(a.k) ;      
	          a.down();                         
	         // a.up();   
		
	}

}
