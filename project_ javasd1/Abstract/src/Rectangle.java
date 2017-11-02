
public class Rectangle extends Shape {
protected double width=1.0;
protected double length=1.0;
public Rectangle (double l){
	width=l;
	length=l;	
}
public Rectangle(double l, double w){
	 width=w;
	 length=l;
}
public double getArea(){
	return length*width;
}
public double getPerimeter(){
	return 2*(width+length);
}
//public String toString()
//{
//	return super.toString()+ width +" "+length+" "+getPerimeter()+" "+getArea();
//	
//}


}
