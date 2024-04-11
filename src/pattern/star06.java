package pattern;

public class star06 {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++) {
			System.out.print("#  ");
		}
		System.out.println();
		for (int i = 1; i <=5; i++) {
			for (int j = i; j <=i; j++) {
				System.out.print("# ");
				System.out.print("   ");
				System.out.print("  ");
				System.out.print("  ");
				System.out.print("   #");
			}
			System.out.println();
		}
		for (int i = 1; i <=5; i++) {
			System.out.print("#  ");
		}
		
	}

}
