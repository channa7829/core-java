package pattern;

public class Solution {

	public static void main(String[] args) {
		Marriage obj=Marriage.getInstance();
		System.out.println("at the age of "+obj.hashCode());
		
		Marriage obj1=Marriage.getInstance();
		System.out.println("at the age of "+obj1.hashCode());
	}

}
