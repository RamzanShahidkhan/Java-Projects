import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class word {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("([^aeiou]*)(.*)");
		Matcher m = p.matcher("word");
		if (m.matches()) {
		System.out.println(m.group(2) +" "+ m.group(1) +"    "+m.group());
		}

	}

}
