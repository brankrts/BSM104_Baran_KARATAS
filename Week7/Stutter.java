package Week7;

import java.util.*;
public class Stutter {

	public static void main(String[] args) {
		
		int[] data = {3,4,5,6,7};
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int n :  data) {
			q.add(n);
		}
		
		System.out.println("Queue = " + q);
		stutter(q);
		System.out.println("Queue = " + q);
		
	}
	
	public static void stutter(Queue<Integer> q) {
		
		int size = q.size();
		while(size>0) {
			int temp = q.remove();
			q.add(temp);
			q.add(temp);
			size--;
		}
	}

}
