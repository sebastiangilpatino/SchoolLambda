package LmbdSchool;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String Name;
	private List<Person> persons;

	public Department(String name) {
		this.Name = name;
		persons = new ArrayList<Person>();
	}

	public void addPerson(Person person) {
		persons.add(person);
	}

	public double getTotalSalary() {

		return persons.stream().mapToDouble(Person::getSalary).sum();
	} // must implement getTotalSalary in two different ways

	public void showAllMembers() {
		persons.stream().map(Person::toString).forEach(System.out::println);
	}

	public void unitsPerFaculty() {
		persons.stream().filter(e -> e.getClass().getSimpleName().equals("Faculty"))
				.forEach(e -> System.out.println(e.toString() + " " + e.getTotalUnits()));
	}

}
