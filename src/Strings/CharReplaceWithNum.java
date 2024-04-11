package Strings;

import java.util.Arrays;

public class CharReplaceWithNum {

	public static void main(String[] args) {

		String str ="jagadish";

		char replacementChar = 'a';

		char[] strarr = str.toCharArray();

		int count =1;

		for (int i = 0; i < strarr.length; i++) {

			if (strarr[i] == replacementChar) {
				strarr[i]=String.valueOf(count).charAt(0);
				count++;
			}
		}
		for (int i = 0; i < strarr.length; i++) {
			System.out.print(strarr[i]);
		}
		System.out.println(Arrays.toString(strarr));
	}

}
