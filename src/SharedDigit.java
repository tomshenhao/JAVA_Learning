
public class SharedDigit {
	public static boolean hasSharedDigit(int number1,int number2) {
		boolean result=false;
		int dig1=0;
		int dig2=0;
		int dig3=0;
		int dig4=0;
		
		
		if (number1 <10 | number1 > 99 | number2 <10 | number2 > 99 ) {
			result=false;
		} else {
			dig1=number1%10;
			dig2=number1/10;
			dig3=number2%10;
			dig4=number2/10;
			if (dig1==dig2|dig1==dig3|dig1==dig4|dig2==dig3|dig2==dig4|dig3==dig4) {
				result=true;
			}
		}
		
		return result;
	}
}
