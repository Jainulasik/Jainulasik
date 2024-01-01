package com.java234;

public class Extend2 extends Java_extends{
	private void father_name() {
		System.out.println("Father name is Sarbudeen");
	}
	private void mother_name() {
		System.out.println("mother name is jahabar nachiya");
	}
	private void father_age() {
		System.out.println(56);
	}
	public static void main(String[] args) {
		Extend2 e = new Extend2 ();
		e.wife_name();e.daughter_name();e.father_name();e.mother_name();e.father_age();
	}
}
