package previous_section;

public class PerfectNumber {
	public static boolean isPerfectNumber(int number) {
		boolean result=false;
		int sum=0;
		
		if(number<1) {
			result=false;
		} else {
			for (int i=1;i < number;i++) {
				if(number%i==0) {
					sum=sum+i;
				} else {
					continue;
				}
			}
			if (sum==number) {
				result=true;
			}
		}
		return result;
	}
}
