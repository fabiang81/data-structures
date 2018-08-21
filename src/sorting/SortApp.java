package sorting;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name: "+name+", age:"+age;
	}

	@Override
	public int compareTo(Person person) {
		return this.age - person.age;
	}
	
}

public class SortApp {
	
	public static void main(String[] args) {
		ArrayList<Person> listOfNames = new ArrayList<>();
		listOfNames.add(new Person("Jena", 3));
		listOfNames.add(new Person("Laya", 1));
		listOfNames.add(new Person("Hussein", 28));
		
		System.out.println("Print before sort");
		listOfNames.forEach(System.out::println);
		
		Collections.sort(listOfNames);
		System.out.println("Print after sort");
		listOfNames.forEach(System.out::println);
	}

}
