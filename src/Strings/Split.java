package Strings;

public class Split {

	public static void main(String[] args) {
		
		String str = "java programming launguge is best";
		
		String[] strg = str.split(" ");
		
		int count =0;
		for (String st : strg) {
			count++;
		}
		
		System.out.println("number of words : "+count);
	}

}