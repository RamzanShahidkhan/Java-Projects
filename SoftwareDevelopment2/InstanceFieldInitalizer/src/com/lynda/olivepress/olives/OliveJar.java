package com.lynda.olivepress.olives;

import java.util.ArrayList;

public class OliveJar {

	public  ArrayList<Olive> olives;
	
	 {
		System.out.println("initializing...");
		olives = new ArrayList<>();
//		olives.add(new Olive("Golden", 0x000000));
//		olives.add(new Olive("Picholine", 0x00FF00));
//		olives.add(new Olive("Kalamata", 0x000000));
	}
	 public OliveJar()
	 {
		 System.out.println("constructor...");
	 }
	 public OliveJar(int nOlives, String name, long color)
	 {
		 for (int i = 1; i <=nOlives; i++) 
		 {
			 olives.add(new Olive(name, color));			 
		 }
	 }
	 

	 

}
