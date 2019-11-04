package employeeproject;

public class Employee {
	private int id;
	private String lastName;
	private String firstName;
	private Department department;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(int num) {
		switch(num) {
			case 1: this.department = Department.ACCOUNTING;
					break;
			case 2: this.department = Department.HR;
					break;
			case 3: this.department = Department.DEVELOPMENT;
					break;
			case 4: this.department = Department.SALES;
					break;
		}
	}
	
	@Override
	public String toString() {
		return "id = " + id + ", lastName = " + lastName + ", firstName = " + firstName + ", department = " + department;
	}
}
