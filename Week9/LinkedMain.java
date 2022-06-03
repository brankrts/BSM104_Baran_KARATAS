package Week9;


public class LinkedMain {

	public static void main(String[] args) {
		
		ListNode list = new ListNode();
		
		list.data = 3;
		list.next = new ListNode();
		list.next.data = 7;
		list.next.next = new ListNode();
		list.next.next.data = 12;
		list.next.next.next = null;
		
		System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
		
	}
}
