package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<>();
		
		fruits.add("watermilaon");
		fruits.add("apple");
		fruits.add("mango");
		
		System.out.println(" list "+ fruits);
		
		fruits.addFirst("strabarry");

		System.out.println(" list "+ fruits);
		
		fruits.add(2, "pinaple");

		System.out.println(" list "+ fruits);
		
		//itter
		Iterator<String> ittr = fruits.iterator();
		
		while (ittr.hasNext()) {
			String string = (String) ittr.next();
			System.out.println(string);
		}
		
		System.out.println("------foreach+lamda");
		
		fruits.forEach((ittrr)->{
			System.out.println(ittrr);
		});
		
		System.out.println("------foreach+advance");
		
		for(String s : fruits) {
			System.out.println(s);
		}
	
	}

}
