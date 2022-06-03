package Week3.Cat;

public class CatDemo {

	public static void main(String[] args) {
		
		
		
		Cat cat1 = new Cat();
		System.out.println(cat1.age + " , " + cat1.color + " , " + cat1.name);
		
		Cat cat2 = new Cat("Tarçýn",2);
		System.out.println(cat2.age + " , " + cat2.color + " , " + cat2.name);
		Cat cat3 = new Cat("Tarçýn","Purple",4);
		System.out.println(cat3.age + " , " + cat3.color + " , " + cat3.name);
	}

}