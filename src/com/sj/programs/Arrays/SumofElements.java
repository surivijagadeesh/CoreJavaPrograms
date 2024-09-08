package com.sj.programs.Arrays;

import java.util.Scanner;

public class SumofElements {
	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		n=sc.nextInt();		
		int[] a=new int[n];		
		System.out.println("Enter array elements: ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();;
		}
		int sum=0;
		for(i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum ="+sum);
	}
}
