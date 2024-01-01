package com.java3;

import java.util.Scanner;

public class Scanner_2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter name");
		String name = s.next();
		System.out.println("Enter goals");
		int goals = s.nextInt();
		System.out.println("Enter title");
		int title = s.nextInt();

		if (goals >325 && title >= 5 ) {
			System.out.println("Nominate to ballon dor");

		}
		else {
			System.out.println("UNQUALIFIED");
	}
}

}

