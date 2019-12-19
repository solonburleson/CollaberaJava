package com.collabera.review.employee;

public class Employee {
    
    private static int counter = 0;
    
    private Object id;
    private String name;
    private int salary;
    private String department;
    public Employee(String name, int salary, String department) {
        this.id = counter++;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
    }
}