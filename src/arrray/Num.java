package arrray;

import java.util.Arrays;

public class Num {

	public static void main(String[] args) {
	
		int[] array1 = {1,3,5,7,9};
		int[] array2 = {2,4,6,8,10};
		int len1 = array1.length;
		int len2 = array2.length;
		int result[] = new int[(len1+len2)/2];
	
	
//		int counter=0;
//		for (int ittr : array1) {
//			result[counter] = ittr;
//			counter++;
//		}
//		for (int ittr : array2) {
//			result[counter] = ittr;
//			counter++;
//		}
//		System.out.println("Array1 coped : "+Arrays.toString(result));
//		
	    System.out.println(" ----------------------------");
	    
	    for (int i = 0; i < result.length; i++) {
	    	result[i] = array1[i]+array2[i];
		}
	    
	    
	    System.out.println(" Array 1 : "+ Arrays.toString(array1));
	    System.out.println(" Array 2 : "+ Arrays.toString(array2));
	    System.out.println(" additation of two arrays : "+Arrays.toString(result));
	    
	    System.out.println("--------------------------------------------------");
	    
	    int[] ages = {23,10,32,45,76,56,75,34,22,199};
	    System.out.println(" original array: "+Arrays.toString(ages));
	    
	    int max;
	    int temp;
		for (int i = 0; i < ages.length; i++) {
			for (int j = 0; j < ages.length; j++) {
				if(ages[j]>ages[i]) {
					temp = ages[j];
					ages[j]=ages[i];
					ages[i]=temp;
				}
			}
		} 
		System.out.println(" sorted array: "+Arrays.toString(ages));
		System.out.println("Maximum element of Array : "+ages[ages.length-1]);
		System.out.println("Minimum element of Array : "+ages[0]);
	}
}
