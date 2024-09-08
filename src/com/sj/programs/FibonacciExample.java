package com.sj.programs;

public class FibonacciExample {
	public static void fibonacci(int n) {
		int a=0,b=1,temp=0;
		for(int i=1;i<=n;i++) {   //i=3
			System.out.print(a +" "); //0,1,1,
			temp=a+b;
			a=b;
			b=temp;
		}
	}
public static void main(String[] args) {
	fibonacci(10);
	
}
}
