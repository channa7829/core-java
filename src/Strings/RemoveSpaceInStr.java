package Strings;

public class RemoveSpaceInStr {

	public static void main(String[] args) {

		String str = " chann a ba s    u";

		System.out.println(" original str : "+str+" - "+str.length());

		System.out.println(" comfact str :"+str.trim().replaceAll("\\s", "")+"- "+str.length());
		
	}

}
