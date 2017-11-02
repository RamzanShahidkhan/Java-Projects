
public class Point {

//	Since a point in 2D plane is composed of
//	x and y coordinates, hence
	private int x;	// we can initialize both variables here too, but better keep it in constructor
	private int y;

//	'No-argument' constructor below does the initialization to base-value
//	This means that whenever I'd create a Point class object using this
//	constructor, the object will have its x and y set to zero. As a consequence,
//	that point object will be the origin. This constructor is similar to 'default'
//	constructor in terms of implementation since it doen't take any argument, AND
//	it also initializes both x and y fields to their base values. But still, we
//	won't call it 'default' constructor.
	public Point(){
		x = 0;
		y = 0;
	}

//	Below is another constructor, the one which is a parameterized/overloaded constructor.
//	If I'm going to instantiate Point object using his constructor, I'll have to provide
//	the x and y coordinates for this point object. This constructor gives me the capability
//	to define any point in a 2D plane (of course on a grid of discrete values since x and y
//	are integers, not real numbers).
	public Point(int a, int b){
		x = a;
		y = b;
	}

//	Now, below are the getter and setter methods for x and y coordinate. Don't ever
//	think that these getter and setter method are mandatory. It's up to me to decide
//	whether I want to write those or not. If I writer a getter, this will give me a
//	capability, that later on in my program, I can read the current x/y value of any
//	point. If I write a setter, it will give me the flexibility that after I create
//	a point object (either using 1st or 2nd constructor), I may change its x, y, or
//	both coordinates.

//	This get method will return the value of x coordinate of the point.
	public int getX() {
		return x;
	}

//	The setter here will reset the value of the x coordinate to the new provided
//	value passed in the argument.
	public void setX(int x) {
		this.x = x; // Remember that 'this' keyword is a reference here; reference
					// of the object through which we'll call this method. We'll
					// have to use it because the variable names (that of the
					// object's field and this method's argument are the same.
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}