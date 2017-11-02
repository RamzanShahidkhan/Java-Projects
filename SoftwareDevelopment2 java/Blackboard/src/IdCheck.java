
import java.util.regex.*;


public class IdCheck {

    //Running this class should produce the following output if it is working properly:
    //true
    //true
    //true
    //true
    //false
    //false
    //false
    public static void main(String args[]) {
        System.out.println(validate("14000000")); //Valid 
        System.out.println(validate("14999999")); //Valid
        System.out.println(validate("14123456")); //Valid
        System.out.println(validate("14141414")); //Valid
        System.out.println(validate("1414"));     //Not valid (not enough numbers)
        System.out.println(validate("10123456")); //Not valid (does not start with 14)
        System.out.println(validate("14ABC123")); //Not valid (contains letters)
    }
    
    /**
     * This method checks a String to see if it matches the format 14XXXXXX where
     * X is ANY single numerical digit
     * @param num The String to check
     * @return true if it is in a valid format, false if it is invalid
     */
    public static boolean validate(String num) {
	//YOUR CODE HERE
    	//Pattern p=Pattern.compile("14[0-9]{6}");
//    	Matcher m=p.matcher(num);
//    	
        
        return num.matches("14[0-9]{6}") ; //The method must return the correct response, true if the number is valid, false if it is not
    }
}