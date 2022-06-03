package Week5;


import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("Ahmet",24));
		personList.add(new Person("Kaya",24));
		personList.add(new Person("Hayri",24));
		
		personList.forEach(person ->{
			System.out.println("Name : " + person.getName() + " , Age : "+ person.getAge());
		});
		
		System.out.println();
		
		for(Person person:personList) {
			System.out.println("Name : " + person.getName() + " , Age : "+ person.getAge());
		}
	}

}
