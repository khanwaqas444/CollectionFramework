package collection.java;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String []args) {
		
		ArrayList<String> people = new ArrayList<>();
		
		people.add("John");
		people.add("Dave");
		people.add("Jane");
		
		people.remove("Dave");
		people.remove(1);
		
		if (people.contains("John")) {
			System.out.println("John is in the list!");
		}
		
		if (people.isEmpty()) {
			System.out.println("The list i empty!");
		}
		people.clear();
		
	}
}
