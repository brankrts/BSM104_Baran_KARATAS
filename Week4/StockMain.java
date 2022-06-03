package Week4;

import java.util.Scanner;

public class StockMain {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("First store name:");
		String store1 = console.next();
		Stock stock1 = new Stock(store1);
		int profit1 = makePurchases(stock1, console);
		
		System.out.println("Second store name  : ");
		String store2 = console.next();
		Stock stock2 = new Stock(store2);
		int profit2 = makePurchases(stock2, console);
		
		if(profit1 > profit2) {
			System.out.println(store1 + " is more useful.");
		}
		else if(profit2 > profit1) {
			System.out.println(store2 + " is more useful");
		}
		else {
			System.out.println(store1 + " and "+ store2 + " equals.");
		}
	}
	
	public static int makePurchases(Stock currentStock,Scanner console) {
		System.out.println("Kaç kez satýn alma yaptýn ?");
		int numPurchases = console.nextInt();
		
		for(int i=1;i <=numPurchases ;i++) {
			System.out.println(i + "; alýmda kaç tane aldýn? Birim fiyatý nedir ?");
			int numShares = console.nextInt();
			int pricePerShare = console.nextInt();
			currentStock.purchase(numShares, pricePerShare);
		}
		System.out.println("Güncel birim fiyatý ?");
		int currentPrice = console.nextInt();
		
		int profit = currentStock.getProfit(currentPrice);
		System.out.println("Net kazanç/kayýp :" + profit + " TL");
		return profit;
	}

}
