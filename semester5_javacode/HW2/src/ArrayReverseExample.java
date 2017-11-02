import java.util.Arrays;

public class ArrayReverseExample 
{  
    static void reverseArray(int inputArray[])
    {
        System.out.println("Array Before Reverse : "+Arrays.toString(inputArray));
         
        int temp;
        for (int i = 0; i < inputArray.length/2; i++)
        {
            temp = inputArray[i];
             
            inputArray[i] = inputArray[inputArray.length-1-i];
             
            inputArray[inputArray.length-1-i] = temp;
        }
        
        System.out.println("Array After Reverse : "+Arrays.toString(inputArray));
    }
    public static void main(String [] args)
    {
    	int [] arr = {1,2,3,4,5};
    	 ArrayReverseExample a= new ArrayReverseExample();
    	 a.reverseArray(arr);
    }
}
