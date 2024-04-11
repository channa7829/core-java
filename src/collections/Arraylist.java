package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		
		List<Integer> alist = new ArrayList<>();
		alist.add(10);
		alist.add(40);
		alist.add(20);
		alist.add(30);
		
		//adding element
		System.out.println(alist);
		
		//replaceing element
		alist.set(1, 50);
		System.out.println(alist);
		
		//asnding
		Collections.sort(alist);
		System.out.println(alist);
		
		//desend
				Collections.reverse(alist);
				System.out.println(alist);
		
		

	}

}
