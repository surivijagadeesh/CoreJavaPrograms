package com.sj.programs;

public class SwapTwoNumbers {
public static void main(String[] args) {
	int a=1,b=2;
	//using without third variable
	a=a+b; 
	b=a-b;
	a=a-b;
	System.out.println("a="+a);
	System.out.println("b="+b);
  
	System.out.println("=================");
	System.out.println("Using third variable");
	int x=4,y=5;
	int temp=x;
	x=y;
	y=temp;
	System.out.println("x="+x);
	System.out.println("y="+y);
	
}
}
