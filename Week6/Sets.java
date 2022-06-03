package Week6;
import java.util.*;


public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("pen");
		aList.add("table");
		aList.add("computer");
		aList.add("notebook");
		aList.add(3,"cabinet");
		aList.add("pen");
		aList.add("table");
		
		System.out.println(aList);
		System.out.println(aList.size()); 
		
		
		Set<String> hList = new HashSet<String>();
		hList.add("pen");
		hList.add("table");
		hList.add("computer");
		hList.add("notebook");
		hList.add("pen");
		hList.add("table");
		
		System.out.println(hList);
		System.out.println(hList.size()); 
		
		Set<String> tList = new TreeSet<String>();
		tList.add("pen");
		tList.add("table");
		tList.add("computer");
		tList.add("notebook");
		tList.add("pen");
		tList.add("table");
		
		System.out.println(tList);
		System.out.println(tList.size());
		System.out.println(tList.contains("table"));
		
		tList.clear();
		System.out.println(tList);
		tList.addAll(aList);
		System.out.println(tList);
				
		
	}

}
