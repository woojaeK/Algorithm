package list;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityLinkedQueueTest {
	public static Node front = null;
	public static Node rear = null;
	
	public static boolean isEmpty() {
		if(front == null) return true;
		else 			  return false;
	}
	
	public static void enqueue(int item) {
		Node n = new Node();
		n.data = item;
		
		if(isEmpty()) {
			front = n;
			rear = n;
		}else {
			if(front.data>item) {
				n.link = front;
				front = n;
			} else {
				Node t = front;
				while(t.link != null) {
					if(t.link.data>item) {
						n.link =t.link;
						t.link = n;
						return;
					} else {
					t = t.link;
					}
				}
				t.link = n;
				rear = n;
			}
		}
	}
	
	public static int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
			return -1;
		}
		int item = front.data;
		front = front.link;
		if(isEmpty()) rear = null;
		return item;
	}
	
	public static int qpeek() {
		if(isEmpty()) {
			System.out.println("Queue Empty");
			return -1;
		}
		int item = front.data;
		return item;
	}
	public static void main(String[] args) {
		enqueue(1);
		enqueue(2);
		enqueue(3);
		System.out.println(qpeek());
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println();
		
	}
}