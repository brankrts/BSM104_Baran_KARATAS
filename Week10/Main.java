package Week10;

public class Main {

	public static void main(String[] args) {
		
		LinkedIntList linklist = new LinkedIntList(); 
		linklist.add(5);
		linklist.add(7);
		linklist.add(9);
		System.out.println(linklist.toString());
		linklist.remove(0);
		System.out.println(linklist.toString());
		linklist.add(14);
		System.out.println(linklist.toString());
		linklist.add(0,11);
		System.out.println(linklist.toString());
		linklist.add(2, 13);
		System.out.println(linklist.toString());
		System.out.println(linklist.size());
	}
}
