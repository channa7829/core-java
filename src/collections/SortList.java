package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		
		List<Engineers> engineer = new ArrayList<>();
		
		engineer.add(new Engineers(10, "channa", 26, 10000000 ));
		engineer.add(new Engineers(20, "kotra", 24, 5000000 ));
		engineer.add(new Engineers(30, "arun", 27, 8000000 ));
		engineer.add(new Engineers(40, "santa", 28, 7000000 ));
		
		System.out.println(" original data--");
		engineer.forEach((ittr)->{
			System.out.println(ittr);
		});
		
		System.out.println(" sorted data --");
		Collections.sort(engineer, new  MySort());
		engineer.forEach((ittr)->{
			System.out.println(ittr);
		});
	
	}

}

class MySort implements Comparator<Engineers>{

	@Override
	public int compare(Engineers o1, Engineers o2) {
		
		return (int) (o2.getSalary() - o1.getSalary());
	}

	
	
	
}
