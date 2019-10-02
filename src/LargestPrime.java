
public class LargestPrime {
	public static int getLargestPrime(int number) {
		int result=0;
		int count=0;
		
		if (number <=1) {
			result=-1;
		} else if (number < 10) {
			result=number;
		} else {		
			for(int i=number-1;i>1; i--) {
				if (number%i==0) {
					for(int j=2;j<=i;j++) {
						if(i%j==0) 
							count++;
						}
					}					
					if (count==1) {
						result=i;
						break;
					}
					count=0;
				}
			if(result==0) {
				result=number;
			}
		}
		return result;
	}
}
