package org.data;

public class JavaSingleton {
	
	
	//private attribute of the class
	private static JavaSingleton tes=null;
	
    //create private constructor-->to avoid object creation of class
	protected JavaSingleton() {
		
	}
	
	public static JavaSingleton getInstance() {
		
		if (tes==null) {
			tes=new JavaSingleton();
		}
		return tes;
	}
	
	public void add() {
		System.out.println("Addition of two numbers");
	}
	
	public void subraction() {
		System.out.println("Subtraction of two numbers");
	}
	
//	public static void main(String[] args) {
//		JavaSingleton instance = getInstance();
//		
//		System.out.println(System.identityHashCode(instance));
//		instance.add();
//		instance.subraction();
//		
//		JavaSingleton instance2 = getInstance();
//		
//		System.out.println(System.identityHashCode(instance2));
//		instance2.add();
//		instance2.subraction();
//	}
}
