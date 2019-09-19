
public class SumOddRange {
	public static boolean isOdd(int number) {
		
		boolean result=false;
		
		if (number <0) {
			result=false;
		}
		else {
			if (number%2!=0) {
				result=true;
			}
		}
		return result;
	}
	
	public static int sumOdd(int start, int end) {
		
		int result=0;
		if (start < 0 | end < 0 | start > end) {
			result=-1;			
		} else {
			for (int i=start; i<=end; i++) {
				if(isOdd(i)) {
					result=result+i;
				}
			}
		}
		return result;
	}
}
