package Week11;

import java.util.*;

public class fibonacciSeries {

	public static void main(String[] args) {
		
		fibonacciSeries fs = new fibonacciSeries();
		List<List<Integer>> fib = fs.fibonacci(5);
		System.out.println(fib);
		// fs.run(5);

	}
	
	private static List<List<Integer>> fibonacci(int numOfRows){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		List<Integer> temp = new  ArrayList<Integer>();
		
		temp.add(1);
		list.add(temp);
		list.add(temp);
		
		
		for(int i = 2; i < numOfRows;i++) {
				List<Integer> firstPrevius = list.get(i-1); 
				List<Integer> secondPrevius = list.get(i-2); 
				
				int first = secondPrevius.get(secondPrevius.size()-1);
				int second = firstPrevius.get(firstPrevius.size()-1);
				
				List<Integer> currentList = new ArrayList<Integer>();
				
				currentList.add(second);
				currentList.add(first+second);
				
				list.add(currentList);
		}
		return list;
	}

	private void run(int numOfRows) {
		long start = System.currentTimeMillis();
		fibonacci(numOfRows);
		long end = System.currentTimeMillis();
		long time = end - start ;
		System.out.println("Total time : "+time);
		
	}
}
