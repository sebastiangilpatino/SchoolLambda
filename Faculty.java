package LmbdSchool;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {

	private double Salary;
	private List<Course> courses;

	public Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.Salary = salary;
		courses = new ArrayList<Course>();
	}

	@Override
	public void addCourse(Course course) {
		courses.add(course);
	}

	@Override
	public double getSalary() {
		return Salary;
	}

	@Override
	public int getTotalUnits() {
		int totalUnits = 0;
		for (int i = 0; i < courses.size(); i++) {
			totalUnits += courses.get(i).getUnirs();
		}
		return totalUnits;
	}
}
