package Week3.Point;


public class PointDemo {

	public static void main(String[] args) {
		
		Points p1 = new Points();
        p1.x = 5;
        p1.y = -7;

        Points p2 = new Points();
        p2.x = 10;
        p2.y = 3;

        System.out.println("(" + p1.x + "," + p1.y + ")");
        double dist = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
        System.out.println("Distance From Orijin "+dist);
        
        p1.x += 10;
        p1.y += 15;
        
        System.out.println("(" + p1.x + "," + p1.y + ")");
        
        
        System.out.println("(" + p2.x + "," + p2.y + ")");
	}

}
