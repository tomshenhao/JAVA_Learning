
public class NumberPalindrome {
	public static boolean isPalindrome(int number) {
		boolean result=false;
		int reverse=0;
		int lastDigt=0;
		int check=0;
		
		number=Math.abs(number);
		check=number;
		
		
		while(check>0) {
			lastDigt=check%10;
			check=check/10;
			reverse=reverse+lastDigt;
			if (check>=1) {
				reverse=reverse*10;
			}
		}		
			
		if (reverse==number) {
			result=true;
		}
		
		return result;
	}
}
