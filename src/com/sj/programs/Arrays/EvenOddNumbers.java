package com.sj.programs.Arrays;

import java.util.Scanner;

public class EvenOddNumbers {
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
		System.out.print("Even Numbers:");
		for(i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd Numbers:");
		for(i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				System.out.print(a[i]+ " ");
			}
		}
	}
}
