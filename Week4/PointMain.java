package Week4;


public class PointMain {

	public static void main(String[] args) {
		
		Point p1 = new Point(7, 2);
		Point p2 = new Point(4, 3);
		
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("Distance from origin: "+p1.distanceFromOrigin());
		
		System.out.println("p1("+p2.getX()+","+p2.getY()+")");
		System.out.println("Distance from origin: "+p2.distanceFromOrigin());
		
		p1.translate(11, 6);
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("Distance from origin: "+p1.distanceFromOrigin());
		
		System.out.println("p1 = "+p1);
		System.out.println();
		
		Point p3 = new Point(7, 2);
		
		Point p4 = new Point(7, 2);
		
		
	}

}
