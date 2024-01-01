package com.java;

public class Methodoverloading {
	private void footballer_info (String name) {
		System.out.println("footballer name is"+ name);
	}
	
	private void footballer_info(int age ,String address) {
		System.out.println(" footballer age is " + age);
		System.out.println("footballer address is "+ address);
	}
	
	private void footballer_info(float networth,long moblno) {
		System.out.println("footballer networth is "+ networth);
		System.out.println("footballer moblno is" +  moblno );
		
		
		
}	
	public static void main(String[] args) {
		Methodoverloading s = new Methodoverloading ();
        s.footballer_info(" Ronaldo");s.footballer_info( 37, "Portugal");s.footballer_info(500, 9566444645l);
	}
	}


