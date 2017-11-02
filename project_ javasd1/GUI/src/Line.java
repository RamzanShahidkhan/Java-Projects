import java.util.ArrayList;

 public class Line {
 private ArrayList<Point> pointList;
 public void addpoint(Point p)
 {
	 pointList.add(p);
 }
 public Line()
 {
	 pointList=new ArrayList<Point>();
 }
 public ArrayList<Point> getPoints()
 {
	 return pointList;
 }
 
}
