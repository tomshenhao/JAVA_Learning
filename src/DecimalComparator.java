
public class DecimalComparator {
	public static boolean areEqulByThreeDecimalPlaces(double number1,double number2){
		
		boolean result;
		
		number1=number1*1000;
		number2=number2*1000;
		
		if (number1<0 && number2<0) {
			number1=Math.ceil(number1);
			number2=Math.ceil(number2);
		}
		else {
			number1=Math.floor(number1);
			number2=Math.floor(number2);
		}
		
		result=false;
		
		if (number1==number2) {
			result=true;
		}
		
		return result;
		
	}
}
