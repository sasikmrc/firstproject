package org.test.today;

public class Singleton {
	
	static Singleton ss;
	
	private Singleton()
	{
		
	}
	
	
	public void test()
	{
		System.out.println("greens");
	}
	
	public static Singleton getInstance()
	{
		if(ss==null)
		{
			
		
		ss=new Singleton();
		}
		
		return ss;
	}
	
	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		
		instance.test();
		
		System.out.println(System.identityHashCode(instance));
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println(System.identityHashCode(instance2));
			
	}

}
