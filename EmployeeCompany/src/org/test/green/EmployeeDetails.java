package org.test.green;

import org.test.tcs.ClientDetails;

public class EmployeeDetails {
	public void empID() {
		System.out.println("Employee ID is 100");
		
	}
public static void main(String[] args) {
	EmployeeDetails a = new EmployeeDetails ();
	a.empID();
	CompanyDetails b = new CompanyDetails ();
	b.companyName();
	ClientDetails c = new ClientDetails();
	c.clientID();
	
}
}
