package Strings;

public class ReverseEachWords {

	public static void main(String[] args) {
		//	Reverse Each Words in a sentence

		StringBuffer sbf = new StringBuffer();
		String str = "channa is very powerfull";
		System.out.println(" Original str :"+str);
		String[] words = str.split(" ");
		String output = "";

		for (String eachword : words) {
			String rev = "";
			for (int i = eachword.length()-1; i >= 0; i--) {
				rev = rev + eachword.charAt(i);
			}
			output = output + rev + " ";
		}
		System.out.println("reverded str :"+output);
	}

}
