package previous_section;

public class EvenDigitSum {
	public static int getEvenDigitSum(int number) {
		int result=0;
		
		if(number<0) {
			result=-1;
		} else {
			while(number >0) {
				if((number%10)%2==0) {
					result=result+number%10;
				}
				number=number/10;
			}
		}
		
		return result;
	}
}
