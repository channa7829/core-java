package arrray;

import java.util.Scanner;

public class NumtoStr {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number : ");
		int number = sc.nextInt();


		String[] tn= {"","One","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String[] ty= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty","hundred"};

		
		int a = number%10; //last digit
		int b = number/10;
		int c = b%10;
		int g = number/100;
		int d = g%10;
		int e = number/1000; 

		if(number>1 && number<=19) {
			System.out.println(tn[number]);
		}else if(number>19 && number<100) {
			System.out.println(ty[b]+" "+tn[a]);
		}else if(number>100 && number<=999){
			System.out.println(tn[g]+" Hundred " +ty[c]+" "+tn[a]);
		}else if(number>999 && number<9999) {
			System.out.println(tn[e]+" Thousond "+tn[d]+" Hundred " +ty[c]+" "+tn[a]);
		}

				System.out.println("a "+a);
				System.out.println("b "+b);
				System.out.println("c "+c);
				System.out.println("g "+g);
				System.out.println("d "+d);
				System.out.println("e "+e);
	}
}
