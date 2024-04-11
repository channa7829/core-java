package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		
		Map<Integer, Student> stdlist = new HashMap<Integer, Student>();
		stdlist.put(1, new Student(101,"channa",26));
		stdlist.put(2, new Student(102,"arun",29));
		stdlist.put(3, new Student(102,"kotra",25));
		
		System.out.println(stdlist.values());
		
		stdlist.forEach((k,v)->{
			System.out.println(k+"  "+v);
		});

	}

}
