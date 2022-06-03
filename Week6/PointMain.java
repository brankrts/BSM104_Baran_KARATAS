package Week6;
import java.util.*;

public class PointMain {

	public static void main(String[] args) {
		
		Set<Point> points = new HashSet<Point>();
		
		Point p2 = new Point(6, 8);
		
		points.add(p2);
		points.add(new Point(3, 4));
		points.add(new Point(3, 4));
		points.add(new Point(5, 7));
		
		System.out.println(points);
		
		for(Point p:points) {
			System.out.println("(" + p.getX() + "," + p.getY() + ")");
		}

	}

}
