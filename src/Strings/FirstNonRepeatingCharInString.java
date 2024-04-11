package Strings;

public class FirstNonRepeatingCharInString {

	public static void main(String[] args) {

		String str = "cvcvcgvcvcvcvcvcvcvdfcvcvcv";

		for (int i = 0; i < str.length(); i++) {
			Boolean repeated = true; 
			for (int j = 0; j < str.length(); j++) {
				if (i!= j && str.charAt(i) == str.charAt(j)) {
					repeated = false;
				}
			}
			if (repeated) {
				System.out.println("firstNon repating char : "+str.charAt(i));
				break;
			}
		}
	}

}
