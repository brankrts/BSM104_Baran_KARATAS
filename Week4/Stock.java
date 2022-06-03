package Week4;

public class Stock {
	private String store;
	private int totalProduct;
	private int totalCot;
	
	public Stock(String thestore) {
		if(thestore == null) {
			throw new NullPointerException();
		}
		store = thestore;
		totalCot = 0;
		totalProduct = 0;
	}
	
	public int getProfit(int currentPrice) {
		if(currentPrice < 0 ) {
			throw new IllegalArgumentException();
		}
		
		int marketValue = totalProduct * currentPrice;
		return marketValue - totalCot;
	}
	
	public void purchase(int shares,int pricePerShare) {
		if(shares < 0 || pricePerShare < 0) {
			throw new IllegalArgumentException();
		}
		
		totalProduct += shares;
		totalCot += shares * pricePerShare;
	}

}
