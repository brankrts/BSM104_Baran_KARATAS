package Week15;

import java.util.*;
import java.util.stream.IntStream;

public class sumPrimes {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("How many prime numbers do you want to sum?");
		int count = console.nextInt();
		int total = SumPrimes(count);
		System.out.println("Total : " + total);
	}
	
	public static int SumPrimes(int count) {
		if(count <= 0) {
			return 0;
		}
		else {
			
			long startPos = System.currentTimeMillis();
			int total = IntStream.iterate(1, n -> n+2)
					.filter(sumPrimes::isPrime2)
					.limit(count-1)
					.sum()+2;
			double cTime = (System.currentTimeMillis() - startPos) / 1000.0;
			System.out.println("Runtime without looking for pairs up to square root : " + cTime);
			return total;
		}
	}
	public static boolean isPrime(int n) {
		
		return IntStream.range(1, n+1)
				.filter(x -> n % x == 0)
				.count() == 2 ;
	}
	public static boolean isPrime2(int n) {
		if(n == 1) {
			return false;
		}
		else {
			int root = (int)Math.sqrt(n);
			return IntStream.range(1, root+1)
					.filter(x -> n % x == 0)
					.count() == 1 ;
		}
	}

}
