package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removedublicats {

	public static void main(String[] args) {

		String string = "channabasu huded";

		//		approch 01- by java 8

		StringBuffer sb = new StringBuffer();
		string.chars().distinct().forEach(c -> sb.append((char)c));
		System.out.println(" non dublicated string  by 01 : "+sb);

		//		approch 02- charAt() & indexof()	
		StringBuffer sbb = new StringBuffer();
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			int indxstr = string.indexOf(ch, i+1);

			if(indxstr == -1) {
				sbb.append(ch);
			}
		}
		System.out.println(" non dublicated string  by 02 : "+sbb);

		//		approch 03 - tocharArray()
		StringBuffer sb3 = new StringBuffer();
		char[] charr = string.toCharArray();

		for (int i = 0; i < charr.length; i++) {
			Boolean repeated = false;
			for (int j = i+1; j < charr.length; j++) {
				if(charr[i] == charr[j]) {
					repeated = true;
					break;
				}
			}
			if(!repeated) {
				sb3.append(charr[i]);
			}
		}
		System.out.println(" non dublicated string  by 03 : "+sb3);
		
		
//		approch 04 - by set interface
		StringBuffer sb4 = new StringBuffer();
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < string.length(); i++) {
			set.add(string.charAt(i));
		}
		for(Character c:set) {
			sb4.append(c);
		}
		System.out.println(" non dublicated string  by 04 : "+sb4);
	}
}
