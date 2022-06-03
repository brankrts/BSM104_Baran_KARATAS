package Week3.Point;



public class Pointmain {

	public static void main(String[] args) {
		
		Points pnt = new Points();
		pnt.x = 3;
		pnt.y = 4;
		
		
		pnt.translate(2, -1);
		System.out.println("(" + pnt.x + "," + pnt.y + ")");
		
		pnt.translate(-5, -7);
		System.out.println("(" + pnt.x + "," + pnt.y + ")");
		
		System.out.println("Distance From Orijin "+ pnt.distanceFromOrgin());
	}

}
