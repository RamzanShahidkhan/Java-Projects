import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verify {

	public static void main(String[] args) {
		String s="123456";
		String pat="[0-9]+";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(s);
		if(m.find())
		{
			System.out.println("verify  " +m.group().matches("[0-9]{6}"));
			System.out.println("verify  " +m.group());
		}

	}

}
