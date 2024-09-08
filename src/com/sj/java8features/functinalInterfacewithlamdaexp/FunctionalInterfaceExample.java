package com.sj.java8features.functinalInterfacewithlamdaexp;

@FunctionalInterface
public interface FunctionalInterfaceExample {

	public void method();  //have only one abstarct method
	
	default String getName(String name) {
		System.out.println("This Default Method name is "+name);
		return name;
	}
	
	static void getAddress() {
		System.out.println("This Static method from Interface");
	}
	
	
}
