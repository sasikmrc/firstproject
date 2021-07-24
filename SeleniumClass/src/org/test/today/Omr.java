package org.test.today;

public class Omr  {

	
	public static void main(String[] args) {
		
	Singleton instance = Singleton.getInstance();
	
	instance.test();
	
	System.out.println(System.identityHashCode(instance));
	
	Singleton instance2 = Singleton.getInstance();
	System.out.println(System.identityHashCode(instance2));
		
	}
}
