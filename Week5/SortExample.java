package Week5;


import java.util.*; 
public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		words.add("Pen");
		words.add("Computer");
		words.add("Bartýn");
		words.add("Book");
		
		System.out.println("Before sorting :" + words);
		System.out.println(words.get(0));
		
		Collections.sort(words);
		System.out.println("After sorting :" + words);
		
	}

}
