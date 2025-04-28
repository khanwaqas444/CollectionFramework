package collection.java;

import java.util.LinkedList;

public class CollectionDemo7  
{
	
	public static void main(String []args) 
	{
		LinkedList<String> Name = new LinkedList<String>();
		
		Name.add("HTML");
		Name.add("Python");
		Name.add("Java");
		System.out.println(Name);
		
		Name.addFirst("CSS");
		System.out.println(Name);
		
		//Name.add("CSS");
		//System.out.println(Name);
		
		Name.addLast("CSS");
		System.out.println(Name);
		
		Name.remove(3);
		System.out.println(Name);
		
		//ForEatch Loop
		for (String str:Name)
		{
			System.out.println(str);
		}
		
	}
}
