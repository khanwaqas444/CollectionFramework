package collection.java;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	
	 public static void main(String []args) {
		 
		 Map map = new HashMap();
		 
		 map.put(101, "Chat");
		 map.put(102, "Chat1");
		 map.put(103, "Chat2");
		 map.put(102, "Chant3");
		 map.put(null, null);
		 
		// map.clear();
		// map.remove(101);
		// map.replace(102, "Chat9");
		// System.out.println(map.get(103));
		// System.out.println(map.containsKey(105));
		// System.out.println(map.containsValue("Chat1"));
        // System.out.println(map.size());
		 
		 System.out.println(map);
		 
	 }

}
