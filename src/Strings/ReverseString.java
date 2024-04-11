package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {



		//______________________________________approch 01 by charAt(i)_________________________________________________
		// reverse a string
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Original String : " +str);
		String rev ="";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.println("revered str :"+rev);
		if (rev.equals(str)) {
			System.out.println("palindrome");
		}else {
			System.out.println("non palindrome");
		}

		//_____________________approch 02 by toCharArray()_________________________________________________

		String string = "channabasu huded";
		char[] chararry = string.toCharArray();
		String revs = "";
		for (int i = 0; i < chararry.length; i++) {
			revs = chararry[i]+revs;
		}
		System.out.println(" revred by approch 02 :"+revs);

		//_____________________approch 03 by toCharArray()_________________________________________________
		
		StringBuffer strbuf =  new StringBuffer("channabasu huded");

		System.out.println("original str :"+ strbuf);

		System.out.println("revered by 03 :"+ strbuf.reverse());
		
		//_____________________approch 04 by toCharArray()_________________________________________________
		
		StringBuilder strbuf1 =  new StringBuilder("yasin");

		System.out.println("original str :"+ strbuf1);

		System.out.println("revered str :"+ strbuf1.reverse());
	}
}
