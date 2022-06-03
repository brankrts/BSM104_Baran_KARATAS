package Week9;

import java.util.*;

public class ReferenceMystery2 {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 9;
		
		BasicPoint p1 = new BasicPoint(); 
		BasicPoint p2 = new BasicPoint(); 
		
		addToXTwice(a,p1);
		System.out.println(a + " " + b + " " + p1.x + " " + p2.x);
		
		addToXTwice(b,p2);
		System.out.println(a + " " + b + " " + p1.x + " " + p2.x);
	}
	
	public static void addToXTwice(int a,BasicPoint p1) {
		a = a+ a;
		p1.x = a;
		System.out.println(a + " " + p1.x);
	}

}
