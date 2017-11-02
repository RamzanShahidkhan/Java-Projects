import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {

	public static void main(String[] args) {
		String s="this my number 03117071310. you know";
		String pat="[0-9]+";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(s);
		
		if(m.find())
		{
			System.out.println("number is " +m.group() );
		}

	}

}
