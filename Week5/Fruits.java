package Week5;


import java.util.ArrayList;

public class Fruits {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");

		System.out.println(list);
		
		for(String fruit:list) {
			System.out.println(fruit);
		}
	}

}
