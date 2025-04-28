package collection.java;

import java.util.Stack;

public class Collection8 {
	
	public static void main(String []args) 
	{
		Stack<String> Name = new Stack<>();  //LIFO
		
		Name.push("Google");
		Name.push("ChatGPT");
		Name.push("DeepSeek");
		//System.out.println(Name);
		
		Name.pop();
		//ForEatch Loop
				for (String str:Name)
				{
					System.out.println(str);
				}
				
	}
}
