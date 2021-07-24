//package
package org.tcs.test;

//class
public class CourseDetails {

	// methods
	private void javaCourse() {
		// business logic
		System.out.println("java course started");
	}

	private void pythoCourse() {
		System.out.println("python course not started");
	}
	// execution starts from main method
	public static void main(String[] args) {
		// ObjectCreation --->ClassName objectName = new ClassName();
		CourseDetails cd = new CourseDetails();
		// method call --->objectName.methodName();
		cd.javaCourse();
		cd.pythoCourse();

	}

}
