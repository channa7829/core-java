package arrray;

import java.util.Arrays;
import java.util.Scanner;

public class DublicateArray {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println(" how many array elements you want !! ");
		int m = sc.nextInt();

		int[] arr =new int[m];

		for (int i = 0; i < m; i++) {
			System.out.println(" enter the "+(i+1)+"  element : ");
			arr[i]= sc.nextInt();
		}

		System.out.print(" dublicate elements are :");

		int n= arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i]==arr[j]) {
					System.out.print(" "+arr[i]);
				}
			}
		}
		
		 int temp;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(arr[j]<arr[i]) {
						temp = arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}
			} 
			System.out.println();
			System.out.println(" sorted array: "+Arrays.toString(arr));
			System.out.println("Maximum element of Array : "+arr[arr.length-1]);
			System.out.println("Minimum element of Array : "+arr[0]);
		
	}

}
