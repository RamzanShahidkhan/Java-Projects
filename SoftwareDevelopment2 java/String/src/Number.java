import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {

	public static void main(String[] args) {
		String s1=" The value was 39.56. This is added to 9.0077700000 That's it";
		String pattern="[0-9]+\\.[0-9]+[1-9]";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(s1);
		while(m.find())
		{
			System.out.println("group   " +m.group() );
		}
		
		
		

	}

}
