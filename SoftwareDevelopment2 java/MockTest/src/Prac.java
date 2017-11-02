
//Classes that implement this interface should define the following
//two methods that perform simple operations with numbers.

public interface Prac {

    /**
     * The addUp method should add two integer values together and return the
     * result
     *
     * @param x the first number
     * @param y the second number
     * @return the sum of x and y
     */ 
    public int addUp(int x, int y);

    /**
     * The evenOdd method should check if the passed argument is an even
     * or an odd number and print to the standard output (terminal) either
     * "EVEN" or "ODD"
     *
     * @param x the integer to be checked
     */
    public void evenOdd(int x);

}