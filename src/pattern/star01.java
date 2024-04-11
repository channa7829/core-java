package pattern;

public class star01 {

	public static void main(String[] args) {
		
		int n=5;
		
		for (int i = 1; i <=5; i++) {
			for (int j = i; j <=5; j++) {
				System.out.print("0 ");
			}
			System.out.println();
		}
	}
}
