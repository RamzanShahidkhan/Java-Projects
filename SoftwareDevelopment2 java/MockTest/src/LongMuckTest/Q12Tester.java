package LongMuckTest;

public class Q12Tester {

    //When run this should print out "Hello", "World", "true" then "false"
    //if your TextDemo program works correctly. DO NOT MODIFY THE CONTENT
    //OF THIS FILE!
    public static void main(String args[]) {
	StringTool t = new TextDemo();
	t.display("Hello");
	t.display("World");
	System.out.println(t.longWord("loooooong"));
	System.out.println(t.longWord("no"));
	System.out.println(t.longWord("love you Ma''om"));
    }

}