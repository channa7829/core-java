package pattern;

public class star03 {

	public static void main(String[] args) {

		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("0 ");
			}
			System.out.println();
			
		}
		for (int i = 2; i <=5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}	
	}
}
