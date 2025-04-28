package collection.java;

import java.util.ArrayList;

public class CollectionDemo4 {
	
	public static void main(String []args) 
	{
		ArrayList<String> Name = new ArrayList<String>();
		
		Name.add("Waqas");
		Name.add("Waqas2");
		Name.add("Waqas3");
		System.out.println(Name);
		
		Name.add("Waqas4");
		System.out.println(Name);
		Name.add(1, "Waqas5");
		System.out.println(Name);
	}
}
