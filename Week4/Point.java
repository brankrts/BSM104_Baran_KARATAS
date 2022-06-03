package Week4;


public class Point {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Point(int initialX,int initialY) {
		setLocation(initialX,initialY);
	}
	
	public double distanceFromOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	
	public void translate(int dx,int dy) {
		x += dx;
		y += dy;
	}
	
	public void setLocation(int newX,int newY) {
		x = newX;
		y = newY;
	}
	
	public String toString() {
		return("p1("+x+","+y+")");
	}
}
