package threding;

class Testclass extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("am from Thred1");
		}
	}
}

public class multithreding {
	

	public static void main(String[] args) {
		
		Testclass test = new Testclass();
		test.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("am from main");
		}

	}

}




