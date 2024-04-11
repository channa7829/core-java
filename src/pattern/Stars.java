package pattern;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		
		System.out.println("plz enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j>=i ; j++) {
				System.out.print("+ ");
			}
		    System.out.println();
		}

	}

}
