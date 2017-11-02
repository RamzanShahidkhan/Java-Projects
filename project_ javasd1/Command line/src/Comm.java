import java.text.NumberFormat;
import java.text.ParseException;

public class Comm {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("pass number");
		}
		Number num= NumberFormat.getInstance().parse(args[0]);
		System.out.println("number is " +num +" has class"+num.getClass().getName());

	}

}
