package LmbdSchool;

public abstract class Person {
	private String Name;
	private String Phone;
	private int Age;

	public Person(String name, String phone, int age) {
		Name = name;
		Phone = phone;
		Age = age;
	}

	public abstract double getSalary();

	public abstract int getTotalUnits();

	public abstract void addCourse(Course course);

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Phone=" + Phone + ", Age=" + Age + "] ";
	}

}
