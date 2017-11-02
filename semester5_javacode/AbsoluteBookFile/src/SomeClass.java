import java.io.Serializable;

public class SomeClass implements Serializable {
	private int num;
	private char letter;
	public SomeClass(){
		num=0;
		letter='A';
	}
	public SomeClass(int n, char c)
	{
		num=n;
		letter=c;
	}
	public String toString()
	{
		return "Number "+num+ "  Letter "+letter;
	}

	public static void main(String[] args) {
		

	}

}
