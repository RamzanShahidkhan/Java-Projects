
public class Commandd {
public static void main(String [] args)
{
	double sum=0;
	for(String i:args)
	{
		sum+=Double.parseDouble(i);
	}
	System.out.println("sum is "+ sum);
}
}
