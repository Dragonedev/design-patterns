package application;

import entities.Course;
import entities.Student;

public class StudentMain {

	public static void main(String[] args) {
		Course c1 = new Course("Software engineer");
		Course c2 = new Course("Nursing");
		Course c3 = new Course("Physiotherapy");

		c1.addStudent("Alice Silva", "20261001");
		c1.addStudent("João Rber", "200501");
		c1.addStudent("Robert Damolan", "26451");
		c1.addStudent("Chloé Datratin", "202614561");

		c2.addStudent("Dimitri Cloan", "25641");
		c2.addStudent("Cleber Lobo", "24631");

		c3.addStudent("Frank Treswolf", "2025341");

		System.out.println(c1);
		for (Student s : c1.getStudents()) {
			System.out.println(s);
		}
		System.out.println("====================================================");
		System.out.println(c2);
		for (Student s : c2.getStudents()) {
			System.out.println(s);
		}
		System.out.println("====================================================");
		System.out.println(c3);
		for (Student s : c3.getStudents()) {
			System.out.println(s);
		}

	}
}
