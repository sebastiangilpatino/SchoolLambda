package LmbdSchool;

public class Staff extends Person {

	private double Salary;

	public Staff(String name, String phone, int age, double salary) {
		super(name, phone, age);
		Salary = salary;
	}

	@Override
	public double getSalary() {
		return Salary;
	}

	@Override
	public int getTotalUnits() {
		return 0;
	}

	@Override
	public void addCourse(Course course) {
		return;
	}

}
