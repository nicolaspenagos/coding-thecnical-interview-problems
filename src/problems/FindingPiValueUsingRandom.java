package problems;

/*
 	1. PROBLEM STATMENT:
 	
 	You have a function than randomly generates numbers from zero to 
 	one and it is uniformed distributed. Calculate the value of PI
 	
 	2. SOLUTION:
 	If a circumference of radio 1 is enclosed in a side square 2
 	and we generates infinite random points, we get that the ratio 
 	between the number of points in circle / number of points in square 
 	is the same as area of circle / area of square.
 	
 	π*r^2 / (2r)^2 = numberOfPointsInCircle / numberOfPointsInSquare
 	π = 4 * (numberOfPointsInCircle / numberOfPointsInSquare)
 			
 */
public class FindingPiValueUsingRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point[] randomPoints = new Point[1000000];
		
		for(int i = 0; i<randomPoints.length; i++) {
			randomPoints[i]= new Point(Math.random(), Math.random());
		}
		
		double PI = valueOfPi(randomPoints);
		
		System.out.println("Approximate value of pi: "+PI);
		
	}
	
	public static double valueOfPi(Point[] randomPoints) {
		
		double pointsInCircle = 0;
		double totalPoints = randomPoints.length;
		
		for(int i = 0; i<randomPoints.length; i++) {
			
			double x = randomPoints[i].x;
			double y = randomPoints[i].y;
			
			double sum = (x*x) + (y*y);
			
			if(Math.sqrt(sum)<=1) {
				pointsInCircle++;
			}
			
		}
		
		return 4.0*pointsInCircle/totalPoints;
	}

}

class Point{
	
	public double x;
	public double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
}
