package Week3.Cat;

public class Cat {
	int age;
	String name;
	String color;
	
	public Cat() {
		this.age = 0;
		this.color = "Color not entered";
		this.name = "Name not entered";
	}
	
	public Cat(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public Cat(String name , String color ,int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	
	
	
	
}
