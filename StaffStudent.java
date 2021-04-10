package LmbdSchool;

public class StaffStudent extends Student {

	private Staff staff;

	public StaffStudent(String name, String phone, int age, double gpa, double salary) {
		super(name, phone, age, gpa);
		staff = new Staff(name, phone, age, salary);
	}

	@Override
	public double getSalary() {
		return staff.getSalary();
	}

}
