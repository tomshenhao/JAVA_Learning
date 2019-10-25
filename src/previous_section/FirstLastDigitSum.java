package previous_section;

public class FirstLastDigitSum {
	public static int sumFirstAndLastDigit(int number) {
		int result=0;
		int round=0;
		
		if (number<0) {
			result=-1;
		} else if (number<10) {
			result=number*2;
		} else {
			while(number>=10) {
				if (round==0) {
					result=number%10;
				}				
				number=number/10;
				round++;
			}
			result=result+number;
		}
		return result;
	}
}
