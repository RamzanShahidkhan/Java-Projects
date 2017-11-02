import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paknum {

	public static void main(String[] args) {
		String s="+923117071310    or03117071310";
		String pat="(\\+923[0-9]{9}|03[0-9]{9})";
		Pattern p=Pattern.compile(pat);
		Matcher m =p.matcher(s);
		while(m.find())
		{
			System.out.println("valid num is  " + m.group());
		}
		

	}

}
