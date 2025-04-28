package collection.java;

import java.util.ArrayList;

public class Collection6{
	
	public static void main(String []args) 
	{
		ArrayList<String> Name = new ArrayList<String>();
		
		Name.add("Donald");
		Name.add("Trump");
		Name.add("DonaldTrump");
		System.out.println(Name);
		
		//Name.remove(0);
		//System.out.println(Name);
		
		//Name.set(0, "Trumpp");
		//System.out.println(Name.get(2));
		
		Name.clear();
		System.out.println(Name);
	}
}
