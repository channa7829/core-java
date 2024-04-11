package basics;

import java.util.Arrays;

public class StdTest {

	public static void main(String[] args) {

		System.out.println("Student Details----");

		Student[] std=new Student[5];

		std[0] = new Student(01,"channa");
		std[1] = new Student(02,"santum");
		std[2] = new Student(03,"arunnm");
		std[3] = new Student(04,"dhghgd");
		std[4] = new Student(05,"arsdns");
		System.out.println("+-------------+------------+");
		System.out.println("| Studentnmae |"+" stdRollNo  |");
		System.out.println("+-------------+------------+");
		for (int i = 0; i < std.length; i++) {
			System.out.println("|"+std[i].StudentName +"       |   "+std[i].stdrollNo+"        |");
		}

	}

}
