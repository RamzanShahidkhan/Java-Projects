package com.lynda.javatraining;

import java.lang.reflect.Constructor;

import com.lynda.javatraining.olives.Olive;
import com.lynda.javatraining.olives.OliveColor;
import com.lynda.javatraining.olives.OliveName;

public class Main {

	public static void main(String[] args) {
		Olive o = new Olive(OliveName.PICHOLINE, OliveColor.GREEN);

		Class<?> c = o.getClass();

		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());

		Constructor<?>[] constructor=c.getConstructors();
		System.out.println("Number of contructors: "+ constructor.length);
		Constructor<?> con=constructor[0];
		//System.out.println(con);
		Object obj=null;
		try {

			obj=con.newInstance(OliveName.PICHOLINE, OliveColor.GREEN);
			System.out.println(obj);

		} catch (Exception e) {
		  System.out.println(e.getMessage());
		}


	}

}
