package Week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocubalary2 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("text.txt"));
		ArrayList<String> list = new ArrayList<String>();

		list = getWord(input);
		System.out.println(list);

	}

	public static ArrayList<String> getWord(Scanner input) {

		ArrayList<String> words = new ArrayList<String>();

		while (input.hasNext()) {
			words.add(input.next().toLowerCase());

		}
		
		Collections.sort(words);
		System.out.println(words);
		
		ArrayList<String> result = new ArrayList<String>();
		if(words.size()>0) {
			result.add(words.get(0));
			for (int i = 1; i < words.size(); i++) {
				if(!words.get(i).equals(words.get(i-1))) {
					result.add(words.get(i));
				}
			}
		}
		return result;
	}
}
