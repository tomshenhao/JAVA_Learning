package previous_section;

public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor(int first, int second) {
		int result=0;
		
		if(first<10 | second<10) {
			result=-1;
		} else {
			for(int i=1;i<=first & i<=second; i++) {
				if(first%i==0 & second%i==0) {
					result=i;
				} else {
					continue;
				}
			}
		}
		
		return result;
	}
}
