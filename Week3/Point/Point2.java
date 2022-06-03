package Week3.Point;



public class Point2 {

	int x;
	int y;
	
	public Point2(int sayi1, int sayi2) {
		this.x = sayi1;
		this.y = sayi2;
		
	}
	
	public double distanceFromOrgin() {
		return Math.sqrt(x*x + y*y);
	}
	
	public void translate(int dx,int dy) {
		x += dx;
		y += dy;
	}
}
