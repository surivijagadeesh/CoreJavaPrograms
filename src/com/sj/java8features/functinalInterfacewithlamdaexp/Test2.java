package com.sj.java8features.functinalInterfacewithlamdaexp;

public class Test2 {
	public static void main(String[] args) {
		//another method by lambda expressions by reducing the code 
		
		//by Lambda Expressions  without Parameters
		FunctionalInterfaceExample lambdaexp=()->{
			System.out.println("This is by Lamda Method without Parameter");
			};
			
			lambdaexp.method();
		
	
	  //by lambda Expressions with one Parameter
			
//		FunctionalInterfaceExample1 lambdaexp1=(String name)-> {  
//			return "This lambda expression with one parameter";
//			};    
			
			
		FunctionalInterfaceExample1 lambdaexp1= name-> "Another process of This lambda expression with one parameter";
		
		System.out.println(lambdaexp1.getName(null));
	
	
	//by lambda Expressions with two Parameter
	FunctionalInterfaceExample2 lambdaexp2=(id,name)->{
		//add logic here
		return "This lambda expression with two parameter";
	};
	
	System.out.println(lambdaexp2.getDetails(0, null));
	
	
	
	}
}
