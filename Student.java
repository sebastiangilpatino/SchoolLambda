package LmbdSchool;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private double GPA;
	private List<Course> courses;

	public Student(String name, String phone, int age, double gpa) {
		super(name, phone, age);
		GPA = gpa;
		courses = new ArrayList<Course>();
	}

	@Override
	public void addCourse(Course course) {
		courses.add(course);
	}

	@Override
	public int getTotalUnits() {
		int totalUnits = 0;
		for (int i = 0; i < courses.size(); i++) {
			totalUnits += courses.get(i).getUnirs();
		}
		return totalUnits;
	}

	@Override
	public double getSalary() {
		return 0;
	}
}
