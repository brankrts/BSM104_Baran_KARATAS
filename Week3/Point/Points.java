package Week3.Point;


public class Points {
	int x;
	int y;
	
	public double distanceFromOrgin() {
		return Math.sqrt(x*x + y*y);
	}
	
	public void translate(int dx,int dy) {
		x += dx;
		y += dy;
	}
}
