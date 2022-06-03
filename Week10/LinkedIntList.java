package Week10;

public class LinkedIntList {
	
	private ListNode front;
	
	public LinkedIntList() {
		front = null;
	}
	
	public void add(int value) {
		if(front == null) {
			front = new ListNode(value);
		}
		else {
			ListNode current = front;
			
			while(current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}
	
	public String toString() {
		if(front == null) {
			return "[]";
		}else {
			String result = "[" + front.data;
			ListNode current = front.next;
			
			while(current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			
			result += "]";
			return result;
		}
	}
	
	public int indexOf(int value) {
		int index = 0;
		ListNode current = front;
		while(current != null) {
			if(current.data  == value) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}
	
	public ListNode nodeAt (int index) {
		ListNode current = front;
		for(int i = 0 ; i < index; i++) {
			current = current.next;
		}
		return current;
	}
	
	public void remove(int index) {
		if(index == 0) {
			front = front.next;
		}
		else {
			ListNode current = nodeAt(index-1);
			current.next = current.next.next;
		}
	}
	
	public void add(int index,int value) {
		if(index == 0) {
			front = new ListNode(value,front);
		}
		else {
			ListNode current = nodeAt(index-1);
			current.next = new ListNode(value,current.next);
		}
	}
	public int size() {
		int count =0;
		ListNode current = front;
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
}
