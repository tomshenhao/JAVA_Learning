package calculation;

public class Series {
	
	public int nSum(int n) {
		return (n*(n+1))/2;
	}
	
	public int factorial(int n) {
		int result=1;
		if(n==0) {
			result=0;
		} else {
			for(int i=1; i<=n; i++) {
				result=result*i;
			}
		}
		return result;
	}
	
	public int fibonacci(int n) {
		int result=0;
		
		if(n==0) {
			result=0;
		} else if(n==1) {
			result=1;
		} else {
			int nMinus1=1;
			int nMinus2=0;
			for(int i=0; i<=n; i++) {
				result=nMinus1+nMinus2;
				nMinus2=nMinus1;
				nMinus1=result;
			}
		}
		return result;
	}
}
