package threding;

class HelpThread implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(" from child Thread");
		}
		
	}
	
}


public class RunnableInterface {

	public static void main(String[] args) {
		
		HelpThread  obj = new HelpThread();
		
		Thread t1 = new Thread(obj);
		t1.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(" from main Thread");
		}
		

	}

}
