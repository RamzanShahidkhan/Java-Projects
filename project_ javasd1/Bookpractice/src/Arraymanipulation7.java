import java.util.Arrays;

import javax.management.Descriptor;

public class Arraymanipulation7 {
   public static void main( String [] args)
   {
	   double[] doubleArray ={8.4,9.3,0.2,7.9,3.4};
	   Arrays.sort(doubleArray);
	   System.out.printf("\ndouble array= ");
	   for(double value:doubleArray)
	   {
		   System.out.printf("%.1f ",value);
	   }
	   int[] filledArray =new int[10];
	   Arrays.fill(filledArray, 7);
	   displayArray(filledArray,   "filledArray");
	   int[] intArray={1,2,3,4,5,6};
	   int[] intArraycopy=new int[intArray.length];
	  
	   System.arraycopy(intArray,0,intArraycopy, 0, intArray.length);
	   //System.out.printf("intArray",intArray);
	   displayArray(intArray, "intArray");
	   displayArray(intArraycopy, "intcopyarray");
	   boolean b=Arrays.equals(intArray, intArraycopy);
	   System.out.printf("\n\n intAarry %s intArraycopy\n",(b?"==" :"!="));
	   b=Arrays.equals(intArray, filledArray);
	   System.out.printf("\n\n intAarry %s filledarray\n",(b?"==" :"!="));
	   int location=Arrays.binarySearch(intArray, 5);
	   if(location>=0)
		   System.out.printf("found 5 at %d in the IntArray",location);
	   else
		   System.out.println("5 not found in IntArray");
	   
   }
   public static void displayArray(int[] array, String description)
   {
	   System.out.printf("\n%s :", description);
	   for(int value:array)
	   {
		   System.out.printf("%d ",value);
	   }
   }
}
