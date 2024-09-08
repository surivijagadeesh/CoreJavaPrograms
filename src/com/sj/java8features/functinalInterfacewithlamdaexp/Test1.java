package com.sj.java8features.functinalInterfacewithlamdaexp;

public class Test1 implements FunctionalInterfaceExample {
   
	@Override
	public void method() {
	  System.out.println("This is by normal process of interface Implements");		
	}
	
	@Override
	public String getName(String name) {
		System.out.println("This Default Method name from Child class "+name);
		return name;
	}
	
	static void getAddress() {
		System.out.println("This Static method from Child class");
	}
	
	public static void main(String[] args) {
		
		Test1 test=new Test1();
		test.method();
		test.getName("Default Method");
		test.getAddress(); //child class static method
		FunctionalInterfaceExample.getAddress(); //Interface static method
		
		//another process by anonymous method
		FunctionalInterfaceExample functionalInterfaceExample = new FunctionalInterfaceExample() {
			@Override
			public void method() {
			  System.out.println("This is by Anonymous Method Process");		
			}
		};
		functionalInterfaceExample.method();
		
		com.sj.java8features.FunctionalInterfaceExample fun = ()-> System.out.println("This is by lambda Method Process");		
		fun.method();
		
	
	}
	
}
