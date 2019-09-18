
public class AreaCalculator {
	public static double area(double radius) {
		double result;
		result=0.0;
		
		if (radius<0) {
			return -1.0;
		}
		
		result=radius*radius*Math.PI;
		
		return result;
	}
	
	public static double area(double x, double y) {
		double result;
		result=0.0;
		
		System.out.println(x);
		System.out.println(y);
		
		if (x<0.0 | y<0.0) {
			result=-1.0;
		}
		
		else {
			result=x*y;
		}
		
		return result;
		
	}
}