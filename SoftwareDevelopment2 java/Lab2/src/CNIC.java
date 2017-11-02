import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CNIC {

	public static void main(String[] args) {
		String s= "38302_8269108_5";
		String pat="[0-9]{5}[_][0-9]{7}[_][0-9]";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(s);
		if(m.find())
		{
			System.out.println("CNIC is " + m.group());
		}

	}

}
