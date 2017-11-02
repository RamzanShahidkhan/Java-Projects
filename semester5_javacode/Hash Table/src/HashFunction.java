import java.util.Arrays;

public class HashFunction {
	
	String theArray[];
	int arraySize;
	int itemsInArray=0;

	public static void main(String[] args) {
		HashFunction theFun= new HashFunction(30);
		
//		String[] elementsToAdd2={"100","510","170","214","268","398",
//				"235","802","900","723","699","1","16","999","890",
//				"725","998","978","988","990","989","984","320","321",
//				"400","415","450","50","660","624"};
//		theFun.hashFunction1(elementsToAdd2, theFun.theArray);
//		theFun.findKey("660");
		String[] elementsToAdd= {"1","5","17","21","26"};
		theFun.hashFunction1(elementsToAdd, theFun.theArray);
		
		theFun.displayTheStack();

	}
	public void hashFunction1(String[] stringsforArray, String[] theArray)
	{
		for(int n=0; n< stringsforArray.length; n++)
		{
			String newElementVal= stringsforArray[n];
			theArray[Integer.parseInt(newElementVal)] =  newElementVal;
		}
	}
	
	public void hashFunction2(String[] stringsforArray, String[] theArray)
	{
		for(int n=0; n< stringsforArray.length; n++)
		{
			String newElementVal = stringsforArray[n];
			int arrayIndex = Integer.parseInt(newElementVal) % 29;
			System.out.println("Modulas Index:= " +arrayIndex +"for value:= "+newElementVal);
			
			while (theArray[arrayIndex] != "-1")
			{
				++arrayIndex;
				System.out.println("Collision Try: "+ arrayIndex +" Instead");
				arrayIndex %= arraySize;
				
			}
			theArray[arrayIndex] = newElementVal;
		}
		
	}
	
	public String findKey (String key)
	{
		int arrayIndexHash = Integer.parseInt(key) % 29;
		while (theArray[arrayIndexHash] != "-1") {
			if(theArray[arrayIndexHash] == key)
			{
				System.out.println(key +" was found on index "+ arrayIndexHash);
				return theArray[arrayIndexHash];
			}
			++arrayIndexHash;
			arrayIndexHash %= arraySize;
		
		}
		return null;
	}
	public HashFunction(int size) {
		arraySize= size;
		theArray = new String[size];
		Arrays.fill(theArray, "-1");
		
	}
	public void displayTheStack() {

		int increment = 0;

		for (int m = 0; m < 3; m++) {

			increment += 10;

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				System.out.format("| %3s " + " ", n);

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

			for (int n = increment - 10; n < increment; n++) {

				if (theArray[n].equals("-1"))
					System.out.print("|      ");

				else
					System.out
							.print(String.format("| %3s " + " ", theArray[n]));

			}

			System.out.println("|");

			for (int n = 0; n < 71; n++)
				System.out.print("-");

			System.out.println();

		}

	}



}
