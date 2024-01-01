package com.Arrays ;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
public static void main(String[] args) {
	List <String> Afr = new ArrayList();
	
	Afr.add("Walmart");
	Afr.add("Amazon");
	Afr.add("TCS");
	Afr.add("CTS");
	Afr.add("Google");
	
	System.out.println(Afr);
	
	boolean contains = Afr.contains("TCS");
	System.out.println(contains);
	
	int size = Afr.size();
	System.out.println(size);
	
    String string = Afr.get(4);	
   System.out.println(string);
   
    String remove = Afr.remove(3);
   System.out.println(Afr);
   
    String set = Afr.set(2, "Zoho");
   System.out.println(Afr);
   


	
}
}
