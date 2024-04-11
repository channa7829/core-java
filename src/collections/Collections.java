package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		
		
		Collection<String> fruits = new ArrayList<String>();
		
		fruits.add("banana");
		fruits.add("graps");
		fruits.add("apple");
		fruits.add("pina");
		fruits.add("mango");
		
		
		System.out.println("all frits : "+fruits);
		
		System.out.println("------foreach");
		
		fruits.forEach((ittr)->{
			System.out.println(ittr);
		});
		
		System.out.println("------lamda+strme");
		fruits.stream().forEach((fruit)->System.out.println(fruit));
		
		System.out.println("------lloop with itterato");
		for (Iterator iterator = fruits.iterator(); iterator.hasNext();) {
			String fruit = (String) iterator.next();
			System.out.println(fruit);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Collection<String>  calisamfruts = new ArrayList<String>();
//		
//		calisamfruts.addAll(fruits);
//		System.out.println(fruits);
		

	}

}
