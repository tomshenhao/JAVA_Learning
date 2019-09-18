
public class EqualSumChecker {
	public static boolean hasEqualSum(int number1,int number2, int number3) {
		
		boolean result;
	
		result=false; 
				
		if (number1+number2==number3) {
			result=true;
		}
		
		return result;
	}
}
