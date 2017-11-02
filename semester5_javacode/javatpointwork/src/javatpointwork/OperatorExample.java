package javatpointwork;

public class OperatorExample {

	public static void main(String[] args) {
		int x=10;  
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10  
		
		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
		
		
		System.out.println(10*10/5+3-1*4/2); 
		System.out.println("Java Shift Operator Example: Left Shift");
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240 
		
		System.out.println("Java Shift Operator Example: Right Shift ");
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
		
		System.out.println("Java Shift Operator Example: >> vs >>>");
		 //For positive number, >> and >>> works same  
	    System.out.println(20>>2);  
	    System.out.println(20>>>2);  
	    //For nagative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	    
	    int a1=10;  
	    int b1=5;  
	    int c1=20;  
	    System.out.println("Java AND Operator Example: Logical && vs Bitwise &");
	    System.out.println(a1<b1&&a1++<c1);//false && true = false  
	    System.out.println(a1);//10 because second condition is not checked  
	    System.out.println(a1<b1&a1++<c1);//false && true = false  
	    System.out.println(a1);//11 because second condition is checked  
	    
	    int a2=2;  
	    int b2=5;  
	    int min=(a2<b2)?a2:b2;  
	    System.out.println("Java Ternary Operator Example");
	    System.out.println(min); 

	}

}
