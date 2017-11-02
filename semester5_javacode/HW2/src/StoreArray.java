import java.util.Scanner;

public class StoreArray {
	
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("how many numbers you want to enter");
		int num = input.nextInt();
		int temp;
		int [] a =new int [num];
		for (int i=0; i <a.length; i++)
		{
			 a[i]=input.nextInt();
		}
		
		System.out.println("array inputs are : ");
		for (int i = 0; i <num; i++) 
        {
            for (int j = i + 1; j < num; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
//		for (int i=0; i <array.length-1; i++)
//		{ 
//			if(array[i] > array[i+1])
//			{
//				int tmp=array[i];
//				array[i] = array[i+1];
//				array[i+1]= tmp;
//			}
//			
//		}
		for(int i=0; i<num; i++)
		{
			System.out.println(a[i]);
		}
		
		
	}
	
	

}
