package Week9;

import java.util.*;

public class pascalTriangle {

	public static void main(String[] args) {
		System.out.println(pascalTriangle(5));
	}
	
	public static List<List<Integer>> pascalTriangle(int numberRow) {
		
		List<List<Integer>> list = new ArrayList<>(); 
		for(int i= 0; i< numberRow;i++) {
			list.add(new ArrayList<Integer>());
		}
		for(int i = 0; i < numberRow;i++) { 
			for(int j = 0;j <= i ; j++ ) { 
				if(j == 0 || i == j) {
					list.get(i).add(1);
				}
				else {
					int mad = list.get(i-1).get(j-1) + list.get(i-1).get(j);
					list.get(i).add(mad);
				}		
			}
		}
		return list; 
	}
}
