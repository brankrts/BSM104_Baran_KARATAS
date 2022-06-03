
package Week5;

import java.util.*;

public class StarAdd {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Pen");
		words.add("Computer");
		words.add("Bartýn");
		words.add("Book");
		
		System.out.println("Before loop : "+ words);
		System.out.println("Length of list :" + words.size());
		
		for (int index = 0; index < words.size(); index+=2) {
			words.add(index , "*");
		}
		
		System.out.println("After loop : "+ words);
		System.out.println("Length of list :" + words.size());
		
		
		for (int index = 0; index < words.size(); index++) {
			words.remove(index);
		}
		/*
		for (int index = words.size()-2; index >= 0; index-=2) {
			words.remove(index);
		}
		*/
		System.out.println("After loop : "+ words);
		System.out.println("Deleted list length  :" + words.size());
		
	}

}
