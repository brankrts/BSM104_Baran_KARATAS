package Week7;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		String[] data = {"java","php","python","c","c++"};
		
		Queue<String> q = new LinkedList<String>();
		
		for(String word: data) {
			q.add(word);
		}
		
		System.out.println("Queue = " + q);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println("Queue = " + q);
		System.out.println(q.size());
		System.out.println("---------------");
		
		while(!q.isEmpty()) {
			System.out.println(q.remove());
			System.out.println("Queue = " + q);
		}
	}

}
