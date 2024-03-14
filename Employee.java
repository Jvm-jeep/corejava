package com.march14;

public class Employee {
private int age;
private String name;
private int empid;
private int salary;


	

	public Employee(int age, String name, int empid, int salary) {
	super();
	this.age = age;
	this.name = name;
	this.empid = empid;
	this.salary = salary;
}




	@Override
public String toString() {
	return "Employee [age=" + age + ", name=" + name + ", empid=" + empid + ", salary=" + salary + ", getAge()="
			+ getAge() + ", getName()=" + getName() + ", getEmpid()=" + getEmpid() + ", getSalary()=" + getSalary()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}




	public int getAge() {
	return age;
}




public void setAge(int age) {
	this.age = age;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public int getEmpid() {
	return empid;
}




public void setEmpid(int empid) {
	this.empid = empid;
}




public int getSalary() {
	return salary;
}




public void setSalary(int salary) {
	this.salary = salary;
}




	public static void main(String[] args) {
		
	}

}
