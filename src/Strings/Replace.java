package Strings;

public class Replace {

	public static void main(String[] args) {
		
		String str =   " hello channa, how are you and channa is good boy";
		System.out.println("old str : "+str);
		System.out.println("replaced str : "+str.replace("h", "H"));
		
	
		System.out.println(" ReplaceAll()  :"+str.replaceAll("h", "A"));

	}

}
