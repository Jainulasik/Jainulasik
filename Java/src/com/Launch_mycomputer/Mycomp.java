package com.java12;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

public class Mycomp {

	public static void main(String[] args) {
		try {
			Desktop desktop = Desktop.getDesktop();
			desktop.browse(URI.create("file:///"));
		 } catch (IOException e) {
	            e.printStackTrace();

		 }
		
			
			
			
			
	
	}
}
