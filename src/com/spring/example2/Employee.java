package com.spring.example2;

public class Employee {
	private int empno;
	private String empname;
	private double salary;
	private String department;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String displayInformation() {
		return "Employee Number : "+empno+"\n Employee Name : "+empname+" \n Employee Salary : "+salary+"\n Department : "+department;
	}
}
