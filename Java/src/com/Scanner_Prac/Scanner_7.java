package com.java3;

import java.util.Scanner;

public class Scanner_7 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Student name");
		String name = s.next();
		
		System.out.println("reg.no");
		int regno = s.nextInt();
		
		System.out.println("english mark");
	    int mark = s.nextInt();
	    
	    
	    
	    if (mark>35) {
	    	System.out.println("pass");
	    }
	    	 
	    else {
	    	System.out.println("Fail");
	    }
	    	
	    	
	    }
		
		

}
