package pattern;

public class Marriage {
	int age=29;
	private static Marriage m;
	private Marriage() {
		System.out.println("Got married");
	}
	public static Marriage getInstance() {
		if(m==null) {
			m=new Marriage();
		}
		return m;
	}

}
