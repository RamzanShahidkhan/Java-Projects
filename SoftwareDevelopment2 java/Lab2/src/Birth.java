import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Birth {

	public static void main(String[] args) {
		String b="11_11_1996";
		String pat="([0-2][0-9]|[0-3][0-1])[_]([0]{1}[1-9]{1}|[1]{1}[1-2]{1})[_][0-9]{4}";
         Pattern p=Pattern.compile(pat);
         Matcher m=p.matcher(b);
         
            System.out.println(m.matches());
            System.out.println();
//         if(m.find())
//         {   
//            System.out.println(m.matches());
//         
//        	 System.out.println("valid " +m.group());
//         }
         
		
		
	}

}
