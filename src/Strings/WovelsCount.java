package Strings;

public class WovelsCount {

	public static void main(String[] args) {
		
		String str = "banglore is beautiful";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.toUpperCase().charAt(i);
		
			if(ch =='A' ||ch == 'E'||ch =='I'||ch =='O'||ch =='U' ) {
				count++;
			}
			
		}
		
		if(count==0) {
			System.out.println("No Wovels found");
		}else {
			System.out.println(" vowels count is : "+count);
		}

	}

}
