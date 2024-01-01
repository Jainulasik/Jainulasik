package com.java12;

import java.util.ArrayList;
import java.util.List;

public class Collectionarraylist {
public static void main(String[] args) {
	
	List<String> As = new ArrayList();
	
	As.add("BMW");
	As.add("Mercedez benz");
	As.add("Bentley");
	As.add("Rolls Royce");
	
	System.out.println(As);
	
	boolean contains = As.contains("BMW");
	System.out.println(contains);
	int size = As.size();
	System.out.println(size);
	String string = As.get(3);
	System.out.println(string);
	String remove = As.remove(2);
	System.out.println(As);
	String set = As.set(1, "Toyota");
	System.out.println(As);
	
	
	
	
	
	
}
}
