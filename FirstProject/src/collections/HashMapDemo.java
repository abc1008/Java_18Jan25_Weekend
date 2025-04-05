package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		
//		HashMap<KeyDataType, ValueDataType> mapName = HashMap<KeyDataType, ValueDataType>(); 
		
		
		Map<Integer, String> map1 = new  HashMap<>();
		
//    insert   --
		
		map1.put(100, "ABC");
		map1.put(200, "PQR");
		map1.put(300, "XYZ");
		map1.put(400, "TUV");
		map1.put(500, null);
		map1.put(300, "POI");
		map1.put(null, "POI");
		
		
		System.out.println(map1);
		
		
//		remove data
		
		String removedValue = map1.remove(400);
		System.out.println(removedValue); 
		System.out.println(map1);
		
		
//		get();   -- to fetch data
		System.out.println(map1.get(600));
		
		
//		keySet();  -- returns all he keys available inside hashmap
		
		 Set<Integer> allKeys = map1.keySet();
		 
		 System.out.println(allKeys);
		 
		 for(Integer i : allKeys)
		 {
			 System.out.println(i);
		 }
		
		
	}
	
	
	

}
