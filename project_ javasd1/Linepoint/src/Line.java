import java.lang.reflect.Constructor;

//import com.sun.javafx.webkit.ThemeClientImpl;

public class Line {

//	A line (straight line) is specified by at least two points. Therefore, when I want
//	to define a line, I need to define two points. Since I've already defined
//	the Point class, so I define my Line class such a way that every Line
//	object will have two point objects. (Remember, that even if we conceptually
//	say that an object 'has' another object, no two objects are in the same
//	memory space.)
	private Point p1;
	private Point p2;

//	Below, I've written 3 overloaded constructors. Why? Just to show you
//	the possibilities, and the consequences. Knowing how exactly to weave your code
//	in different approaches, and what are the design tradeoffs is the essence
//	of good OO programming.

//	This constructor will give the capability to initialize my Line object
//	by providing references of two Point objects which I create (somewhere else, say
//	in main() method). As a consequence, you'll have to create point objects
//	before creating the line object. This also means, if you already know your points,
//	you can easily pass those and create your line object using this constructor
	public Line(Point x1y1, Point x2y2){
		p1 = x1y1;
		p2 = x2y2;
	}


//	This is a no-argument constructor. Remember, it is NOT the default constructor.
//	Default constructor is the one which compiler provides, if you don't write any
//	constructor in your class definition. The constructor given below is only similar
//	to the 'default' constructor in the sense that it also doesn't take any argument.
//	If it were a default constructor, it would have initialized both p1 and p2 references
//	as NULL. While our 'no-argument' constructor creates two point objects, and
//	associates those with the Line object.
	public Line(){
		p1 = new Point();
		p2 = new Point();
	}

//	Here, I've defined another constructor (another overloaded form) which directly
//	takes x and y coordinates of both the points, and uses those to instantiate two
//	point objects which get associated with the Line object constructed using this
//	constructor.
	public Line(int x1, int y1, int x2, int y2){
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

//	The setters below allow changing a line's points, after the line object has been
//	initialized. Now if I know that I'll never need to change a line's points once it
//	is created, I won't need setters. In that case, following two methods shouldn't be
//	in my class definition.
	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
}