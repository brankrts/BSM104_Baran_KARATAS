package Week9;

public class Account {
	String name;
	int money;
	
	public Account(String name,int money) {
		this.name = name;
		this.money = money;
	}
	public String toString() {
		return name+":$"+ money;
	}
}
