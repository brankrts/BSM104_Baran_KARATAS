package Week15;

import java.util.*;
import java.util.function.*;

public class MathTutor {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		givesProblems(console, 4, "+", (x,y) -> x + y);

	}
	
	public static void givesProblems(Scanner console,int numProblems,String text,IntBinaryOperator operator) {
		
		Random r = new Random();
		int correctAnswers = 0;
		for(int i = 0 ;i<numProblems;i++) {
			int num1 = r.nextInt(12);
			int num2 = r.nextInt(12);
			System.out.println(num1 + " " + text + " " + num2 + " = ");
			
			int answer = operator.applyAsInt(num1, num2);
			int pAnswer = console.nextInt();
			
			if(answer == pAnswer) {
				System.out.println("Correct");
				correctAnswers++;
			}
			
			else {
				System.out.println("False . Answer = "+answer);
			}
		}
		System.out.println(numProblems +  " Number of Correct in Question: " + correctAnswers);
	}

}
