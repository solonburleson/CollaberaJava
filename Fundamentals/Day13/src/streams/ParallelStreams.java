package streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1,"Mark",36,20000));
		employees.add(new Employee(2,"Alex",46,3000));
		employees.add(new Employee(3,"Brian",52,15002));
		employees.add(new Employee(4,"Duane",26,7856));
		employees.add(new Employee(5,"Lisa",18,200));
		employees.add(new Employee(6,"John",45,50000));
		
		long t1 = System.currentTimeMillis();
		System.out.println("Sequential stream count: " + employees.stream().filter(e -> e.getSalary() > 15000).count());
		
		long t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream Time taken: " + (t2-t1));
		
		t1 = System.currentTimeMillis();
		System.out.println("Parallel Stream count: " + employees.parallelStream().filter(e -> e.getSalary() > 15000).count());
		
		t2 = System.currentTimeMillis();
		System.out.println("Parallel Stream Time taken: " + (t2-t1));
	}
}

class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;
	
	Employee(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	Employee(int id, String name, int age, int salary){
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary +"]";
	}
}
