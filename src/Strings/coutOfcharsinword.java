package Strings;

import java.util.HashMap;
import java.util.Map;

public class coutOfcharsinword {

	public static void main(String[] args) {
		
		String str = "channabasu huded";
        
		Map<Character, Integer> map = new HashMap<>();
		
		char[] chars = str.toCharArray();
		
		for (char ch : chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else{
				int existingcount =map.get(ch);
				map.put(ch, existingcount+1);
			}
		}
		System.out.println(map);
	}
 
}
