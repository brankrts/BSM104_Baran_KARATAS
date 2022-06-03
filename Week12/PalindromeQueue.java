package Week11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeQueue {

	public static void main(String[] args) {
		System.out.println("Enter a string expression ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
		Queue queue = new LinkedList();
		
		for(int i = inputString.length() - 1;i >= 0;i--) {
			queue.add(inputString.charAt(i));
		}
		
		String reverseString = "";
		while(!queue.isEmpty()) {
			reverseString = reverseString + queue.remove();
		}
		if(inputString.equals(reverseString)) {
			System.out.println("The entered word is palindrome.");
		}
		else {
			System.out.println("The entered word isn't palindrome.");
		}
	}

}
