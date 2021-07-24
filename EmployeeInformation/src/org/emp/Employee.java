package org.emp;

import org.client.Client;
import org.company.Company;

public class Employee {
	public void empName() {
	System.out.println("Employee Name : Sasikumar");

	}
	
	public static void main(String[] args) {
		Employee a = new Employee();
		Company b = new Company();
		Client c = new Client();
		a.empName();
		b.companyName();
		c.clientID();
	}
	}


