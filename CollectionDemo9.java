package collection.java;

import java.util.ArrayDeque;

public class CollectionDemo9 {
	
	public static void main(String []args) 
	{
		ArrayDeque<String> Name = new ArrayDeque<>();  //FIFO
		
		Name.add("Google");
		Name.add("ChatGPT");
		Name.add("DeepSeek");
		System.out.println(Name);
		
		Name.remove();
		//ForEatch Loop
				for (String str:Name)
				{
					System.out.println(str);
				}
				
	}
}
