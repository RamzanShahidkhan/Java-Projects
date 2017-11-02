package com.lynda.olivepress.olives;

import java.util.ArrayList;

public class oliveJar {
	public static ArrayList<Olive> olives;
	
	static {
		System.out.println("Intializing...");
		olives=new ArrayList<>();
		olives.add(new Olive("Kalamata",0x000000));
		olives.add(new Olive("Kala",0x00FF00));
		olives.add(new Olive("watson",0x000000));
		
//		olives.add(new Olive("Kalamata"));
//		olives.add(new Olive("Kala"));
//		olives.add(new Olive("watson"));
		
	}
	

}
