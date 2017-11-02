import java.io.InvalidClassException;
import java.io.NotActiveException;
import java.io.StreamCorruptedException;

public class ExceptionHandler {

    public static void handle() {
	try {
		Thrower.launch();
	} catch (StreamCorruptedException e) {
		System.out.println("SCE");
	} catch (InvalidClassException e) {
		System.out.println("ICE");
	} catch (NotActiveException e) {
		System.out.println("NAE");
	}
    }
    public static void main(String [] arg)
    {
   	  ExceptionHandler s=new ExceptionHandler();
   	     handle();
    }
}