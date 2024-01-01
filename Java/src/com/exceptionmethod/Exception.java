package com.exceptionmethod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
	public static void main(String[] args) {
		
		Scanner c=new Scanner(System.in);
		
		System.out.println("a=  ");
		int a = c.nextInt();
		
		System.out.println(" b= ");
		int b = c.nextInt();
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("axb="+(a*b));
		
		
		try {
			System.out.println("a/b="+(a/b));
		}
		catch(InputMismatchException ie ) {
			System.err.println("Wrong input");
			
		}
		catch (Exception e) {
			System.err.println("Exception error");
		}
		

	
	

	
	
	
	
	
	
	
	
	
}
}
