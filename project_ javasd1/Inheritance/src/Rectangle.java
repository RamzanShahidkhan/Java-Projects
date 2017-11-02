
public class Rectangle extends Shape {
protected double width=1.0;
protected double length=1.0;
public Rectangle (){
	width=1.0;
	length=1.0;	
}
public Rectangle(double width, double length){
	 this.width=width;
	 this.length=length;
}

public Rectangle(double width, double length,String color,boolean filled){
	super(color,filled); 
	this.width=width;
	 this.length=length;
}
public void setWidth(double w){
	width=w;
}
public double getWidth(){
	return width;
}
public void  setLength(double l){
	length=l;
}
public double getLength(){
	return length;
	
}
public double getArea(){
	return length*width;
}
public double getPerimeter(){
	return 2*(width+length);
}
public String toString()
{
	return super.toString()+ width +" "+length+" "+getArea()+" "+getPerimeter();
	
}


}
