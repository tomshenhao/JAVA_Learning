package previous_section;

public class LastDigitChecker {
	public static boolean hasSameLastDigit(int number1, int number2, int number3) {
		boolean result=false;
		boolean result1, result2, result3;
		
		result1=isValid(number1);
		result2=isValid(number2);
		result3=isValid(number3);
		
		if (result1&result2&result3) {
			number1=number1%10;
			number2=number2%10;
			number3=number3%10;
			if (number1==number2|number1==number3|number2==number3) {
				result=true;
			}
		}		
		
		return result;
	}
	
	public static boolean isValid(int number) {
		boolean result=false;
		
		if(number>=10 & number<=1000) {
			result=true;
		}
		
		return result;
	}
}
