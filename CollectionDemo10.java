package collection.java;

import java.util.ArrayDeque;

public class CollectionDemo10 {
	
	public static void main(String []args) 
	{
		ArrayDeque<String> Name = new ArrayDeque<>();  //FIFO
		
		Name.add("1");
		Name.add("2");
		Name.add("3");
		System.out.println(Name);
		
		Name.remove();
		//ForEatch Loop
				for (String str:Name)
				{
					System.out.println(str);
				}
				
	}
}
