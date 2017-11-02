
public class LogicalOperator5 {

	public static void main(String[] args) {
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"conditional AND( &&)\n","false && false",false && false,
				"false && true",false && true,
				"true && false",true && false,
				"true && true",true && true);
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"conditional OR( ||)\n","false ||false",false|| false,
				"false || true",false || true,
				"true || false",true || false,
				"true || true",true ||true);
		// truth table for logical and operator &
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Bolean logical AND( &)\n","false & false",false & false,
				"false & true",false & true,
				"true & false",true & false,
				"true & true",true & true);
				//table for logical OR operator inclusive |
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Bolean logical inclusive OR( |)\n","false |false",false| false,
				"false | true",false | true,
				"true | false",true | false,
				"true | true",true |true);
		//table for logical OR operator exclusive ^
		System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
				"Bolean logical exclusive OR( ^)\n","false |false",false ^ false,
				"false ^ true",false ^ true,
				"true ^ false",true ^ false,
				"true ^ true",true ^ true);
		// logical negation  operator !
		System.out.printf( "%s\n%s: %b\n%s: %b\n", "Logical NOT (!)",
				"!false",(!false),  "!true",(!true));
	}

}
