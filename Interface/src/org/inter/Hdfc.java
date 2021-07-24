package org.inter;

public class Hdfc implements Rbi,Sbi {

	@Override
	public void current() {
		System.out.println("8%");
		
	}

	@Override
	public void savings() {
		System.out.println("8%");
		
	}

	@Override
	public void fixed() {
		System.out.println("10%");
		
	}
	
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		h.current();
		h.fixed();
		h.savings();
	}
	
	

}
