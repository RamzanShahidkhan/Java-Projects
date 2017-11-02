package com.lynda.javatraining;

import com.lynda.olivepress.olives.OliveJar;

public class MemberClasses {

	public static void main(String[] args) throws Exception {
       System.out.println("Starting application main method..");
		OliveJar jar = new OliveJar();
		jar.addolive("Kala " ,0x000000);
		jar.addolive("Kala " ,0x000000);
		jar.addolive("Kala " ,0x000000);
		jar.addolive("Kala " ,0x000000);
		jar.reportOlive();
	}
	
}
	