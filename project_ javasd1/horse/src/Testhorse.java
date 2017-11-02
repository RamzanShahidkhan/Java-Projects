

public class Testhorse {
	public static void main(String [] args){
		
	
  Horse[] array= new Horse[6] ;
  array[0]= new Arabian();
  array[1]= new Amercan();
  array[2]=new Shire();
  array[0].move("Right", 45);
  //array[0].move("Left", 34);
  array[1].move("Left", 34);
  array[2].move("Up", 24);
  //array[3].move("Down",9);
  // System.out.println("First"+" x ="+array[0].getX()+"  y= "+ array[0].getY());
  System.out.println("Arabian  "+" x ="+array[0].getX()+"  y= "+ array[0].getY());
  System.out.println("American  "+"x= "+array[1].getX()+"  y= "+ array[1].getY());
  System.out.println("Shire    "+" x ="+array[2].getX()+"  y="+ array[2].getY());
  //System.out.println(array[3].getX()+ array[3].getY());
  
	}
  
}
