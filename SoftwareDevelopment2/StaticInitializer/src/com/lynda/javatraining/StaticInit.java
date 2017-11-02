package com.lynda.javatraining;

import java.util.ArrayList;

import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.olives.oliveJar;

public class StaticInit {

	public static void main(String[] args) throws Exception {
       
		System.out.println("Starting application");
		ArrayList<Olive> olives=oliveJar.olives;
		for(Olive o:olives)
		{
			System.out.println("It's a  " +o.oliveName + "  Olive!");
		}
		
	}
	
}
