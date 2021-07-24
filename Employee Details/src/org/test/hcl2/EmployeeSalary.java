package org.test.hcl2;

import org.test.hcl.EmployeeDetails;

public class EmployeeSalary {
	private void empSalary() {
		// TODO Auto-generated method stub
		System.out.println("Employee salary - 26,000");

	}
private void empPF() {
	// TODO Auto-generated method stub
System.out.println("Employee PF -  2000");
}
public static void main(String[] args) {
	EmployeeDetails b = new EmployeeDetails ();
	b.empID();
	b.empName();
	EmployeeSalary a = new EmployeeSalary ();
	a.empSalary();
	a.empPF();
	
	
}
}

