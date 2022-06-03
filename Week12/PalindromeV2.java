package Week11;

import java.util.Scanner;

public class PalindromeV2 {

	public static void main(String[] args) {
		System.out.println("Enter a string expression ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		
		System.out.println(isPalindrome(inputString));
	}
	public static Boolean isPalindrome(String str) {
		if(str == null || !isAlpha(str)) {
			return false;
		}
		
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(left++) != str.charAt(right--)){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAlpha(String s) {
		char[] charArr = s.toCharArray();
		for(char c : charArr) {
			if(!Character.isLetter(c)){
				return false;
			}
		}
		return true;
	}

}
