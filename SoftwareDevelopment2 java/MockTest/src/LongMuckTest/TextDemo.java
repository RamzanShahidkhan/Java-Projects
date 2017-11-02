package LongMuckTest;

public class TextDemo implements StringTool {

	@Override
	public void display(String s) {
		System.out.println("string is  " +s);
		
	}

	@Override
	public boolean longWord(String s) {
		if (s.length() >5)
			return true;
		return false;
	}

}
