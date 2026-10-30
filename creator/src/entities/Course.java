package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {

	private String name;
	private List<Student> students;

	public Course(String name) {
		this.name = name;
		this.students = new ArrayList<>();
	}

	public Student addStudent(String name, String registration) {
		Student s = new Student(name, registration);
		students.add(s);

		return s;
	}

	public String getName() {
		return name;
	}

	public List<Student> getStudents() {
		return Collections.unmodifiableList(students);
	}

	@Override
	public String toString() {
		return "Course name:" + name;
	}

}
