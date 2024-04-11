package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		Map<Integer,String> mapobj = new HashMap<>();
		
		mapobj.put(1, "channa");
		mapobj.put(2, "arun");
		mapobj.put(3, "kotra");
		mapobj.put(4, "santa");
		
		System.out.println(mapobj);
		
		System.out.println(mapobj.isEmpty());
		
		System.out.println(mapobj.size());
		
		//only by key can get the value
		String val = mapobj.get(1);
		System.out.println("val "+val);
		
		if (mapobj.containsKey(1)) {
			System.out.println("present");
		}else {
		System.out.println(" not in");
		}
		if (mapobj.containsValue("rena")) {
			System.out.println("present");
		}else {
		System.out.println(" not in");
		}
		
		System.out.println("---------------");
		System.out.println("get keys and values");
		System.out.println("---------------");
		
		 Set<Integer> keySet = mapobj.keySet();
		 System.out.println(keySet);
		 
		 Collection<String> values = mapobj.values();
		 System.out.println(values);


		 System.out.println("---------------");
			System.out.println("ittration");
			System.out.println("---------------");
			
			for(Map.Entry<Integer,String> entry:mapobj.entrySet() ) {
				System.out.println(" key -> "+entry.getKey()+ " Values ->"+entry.getValue());
			}
			
			
		
	}

}
