package Week2;


import java.util.Arrays;

public class Week2QuestionsResult extends Week2Question {
	
	
	
	
	public static void main(String[] args) {
		
		//Question 1 
		System.out.println("Question 1 ");
		int [] Unique = {3, 8, 12, 2, 9, 17, 43, -8, 46};
		int [] notUnique ={4, 7, 3, 9, 12, - 47, 3, 74};
		isUnique(Unique);
		isUnique(notUnique);
		System.out.println(isUnique(Unique));
		System.out.println(isUnique(notUnique));
		
		//Question 2
		System.out.println("Question 2 ");
		double [] notSorted = {16.1, 12.3, 22.2, 14.4} ;
		double [] Sorted = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
		System.out.println(isSorted(Sorted));
		System.out.println(isSorted(notSorted));
		
		//Question 3
		System.out.println("Question 3 ");
		int [][] A ={{1,3,4},{2,4,3},{3,4,5}} ;
 		int [][] B ={{1,3,4},{2,4,3},{1,2,4}};     
 		System.out.println(Arrays.deepToString(matrixAdd(A,B)));
 		
        //Question 4
		System.out.println("Question 4 ");
		System.out.println(sumTo(2));
		
		//Question 5
		System.out.println("Question 5 ");
		writeBinary(5);
		
	
	}

}
