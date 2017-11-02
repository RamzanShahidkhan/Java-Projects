
public class Cylinder extends Circle {
    private double height=2.0;
    public Cylinder()
    {
    	
    }
    public Cylinder(int t,double h)
    {  
    	super(t);
    	height=h;
    }
    public void setheight(double hh)
    {
    	height=hh;
    }
    public double getheight()
    {
		return height;
    	
    }
    public String toString()
    {
		return super.toString() + height;
    	
    }
    
    public double getvolume()
    {
		return 2*Math.PI*(getr()+height);
    	
    }
    
}
