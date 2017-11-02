import java.util.Random;
import java.io.*;

public class Thrower {

    public static void launch() throws StreamCorruptedException, InvalidClassException, NotActiveException {
	Random r = new Random();
	switch (r.nextInt(3)) {
	case 0: throw new StreamCorruptedException();
	case 1: throw new InvalidClassException("this", "that");
	case 2: throw new NotActiveException();
	}
    }
}