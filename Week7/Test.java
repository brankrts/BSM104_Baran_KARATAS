package Week7;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Integer[] data = {3,13,8,2,1,9,3,15};
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int n : data) {
			q.add(n);
		}
		
		removeAll(q,3);		
		System.out.println("Queue = " + q );
	}
	
	public static void removeAll(Queue<Integer> q,int value) {
		int size = q.size();
		
		for(int i = 0; i < size ; i++) {
			System.out.println("Queue = "+ q);
			int n = q.remove();
			System.out.println(n+ ". Element removed ");
			System.out.println("Queue = "+ q);
			if(n != value) {
				q.add(n);
				System.out.println(n+ ". Element added  ");
			}
		}
	}
}
