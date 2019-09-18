
public class Inchestocentimeters {
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		double result;
		result=0;
		
		if (feet < 0|inches <0|inches > 12) {
			result=-1;
		}
		
		result=inches*2.54+(feet*12)*2.54;
		return result;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		double result;
		result=0;
		
		if (inches<0) {
			result=-1;
		}
		
		result=inches*2.54;
		return result;
	}
}
