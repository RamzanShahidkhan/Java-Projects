package LongMuckTest;

//Classes that implement this interface should define the following
//two methods that perform simple operations with Strings.

public interface StringTool {

  //The display method should print the String s to the terminal window.
  //Each separate call to this method should print the passed String on
  //a separate line
  public void display(String s);

  //The longWord method should return a boolean depending on the length
  //of the String s. If the String contains more than 5 characters then
  //the method should return true.
  //If the String contains 5 characters or less it should return false.
  public boolean longWord(String s);

}