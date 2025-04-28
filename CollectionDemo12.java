package collection.java;

import java.util.Stack;

public class CollectionDemo12 {
	
	public static void main(String []args) 
	{
		Stack<String> Name = new Stack<>();  //LIFO
		
		Name.push("Redmi");
		Name.push("Iphone");
		Name.push("SamSung");
		//System.out.println(Name);
		
		Name.pop();
		//ForEatch Loop
				for (String str:Name)
				{
					System.out.println(str);
				}
				
	}
}
