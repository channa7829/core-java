package Strings;

public class eqels {

	public static void main(String[] args) {

		String str1 = new String("Java");
		
		System.out.println(str1.hashCode());

		String str2 = "hello";
		
		System.out.println(str2.hashCode());
		
		String str3 = "hello";
		
		System.out.println(str3.hashCode());

		String str4 = new String("java");
		
		System.out.println(str4.hashCode());
		
		String str5 = "hello";
		System.out.println(str5.hashCode());
		Boolean res = (str1 == str4);
		
		System.out.println("str1 & str4  == : "+res);
		
		 res = str1.equalsIgnoreCase(str4);
		 
		System.out.println("str1 & str4  eql() : "+res);
	}

}
