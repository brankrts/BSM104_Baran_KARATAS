package Week2;

import java.util.ArrayList;




public class Week2Question {
	
	
	
	public static boolean  isUnique (int array[]) {
		int count = -1;
		boolean currentState = true;
		for (int i =0;i<array.length;i++) {
			for(int j = 0;j<array.length;j++) {
				
				if(array[i]==array[j]) {
					count ++;
					
				}
			}
			
			
			if (count  == 0) {
				count = -1;
				continue;
			}
			else if (count >0) {
				currentState = false;
				break;
			}
			
			else {
				currentState =true;
				
			}
			
		}
		
		return currentState;
		
	}
	public static boolean isSorted(double array[]) {
		boolean currentState = false;
		if(bigToSmall(array)  || smallToBig(array)) {
			currentState = true;
			}
		else {currentState =false;}

		return currentState;
	}
	public static boolean smallToBig (double array[]) {
		double temp =0.0;
		boolean currentState = false;
		for(int i = 1 ;i<array.length;i++) {
			
			temp = array[(i-1)];
			if (array[i]>temp) {
				currentState=true;
				
			}
			else {
				currentState =false;
				break;
			}
			
		
	}
		return currentState;
		}
	public static boolean bigToSmall (double array[]) {
			double temp =0;
			boolean currentState = false;
			for(int i = 1;i<array.length;i++) {
				
				temp = array[ (i-1)];
				if (array[i]<temp) {
					currentState=true;
				}
				else {
					currentState =false;
					break;
				}
				
			
		}
		
		
	

              return currentState;
              }
	public static int[][] matrixAdd (int [][] array1,int [][] array2) {
	int [][] arraySums = new int [array1.length][array1[0].length];

			for (int i =0;i<array1.length;i++) {
				
				for(int j =0;j<array1[0].length;j++) {
					
					arraySums[i][j]  = array1[i][j]+array2[i][j];
					
						
					
			}
			
		}
			
			
		
		
		
		return arraySums;
	}
	public static double sumTo(int n) {
		
		if (n<0) {
			throw new IllegalArgumentException();
		}
		else if (n>=1){
			double value =1.0/(double)n + sumTo(n-1);
			
			return value;
		}
		
		
		else {return 0;}
	}
	public static void writeBinary(int n ) {
		
		ArrayList<Integer> writeBinary = new ArrayList<Integer>();
		while (n>=2){
			
			int modN =n%2;
			
			writeBinary.add(modN);
			n=(int)n/2;
			
			
		}if (n!=0) {
		writeBinary.add(n);
		}
		System.out.println(reverseArrayList(writeBinary));
		
		
		
	}
	public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arrayList) {
		ArrayList <Integer> reversedArrayList = new ArrayList<Integer>();
		
		for (int i =arrayList.size()-1;i>=0;i--) {
			
			reversedArrayList.add(arrayList.get(i));	
		}
		
		return  reversedArrayList;
		

		
	}
}
