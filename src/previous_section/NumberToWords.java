package previous_section;

public class NumberToWords {
	public static void numberToWords(int number) {
		
		int before_digit=0;
		int after_digit=0;
		int diff=0;
		
		if (number < 0) {
			System.out.println("Invalid Value");
		} else if(number==0){
			System.out.println("Zero");
		} else {
			
			before_digit=getDigitCount(number);
			number=reverse(number);
			after_digit=getDigitCount(number);
			diff=before_digit-after_digit;
			
			if (diff==0) {
				while(number >0) {
					switch(number%10) {
					case 1: 
						System.out.println("One");
						break;
					case 2:
						System.out.println("Two");
						break;
					case 3: 
						System.out.println("Three");
						break;
					case 4:
						System.out.println("Four");
						break;
					case 5: 
						System.out.println("Five");
						break;
					case 6:
						System.out.println("Six");
						break;
					case 7: 
						System.out.println("Seven");
						break;
					case 8:
						System.out.println("Eight");
						break;
					case 9: 
						System.out.println("Nine");
						break;
					case 0:
						System.out.println("Zero");
						break;
					default:
						break;
					}
					number=number/10;
				}
			} else {
				while(number >0) {
					switch(number%10) {
					case 1: 
						System.out.println("One");
						break;
					case 2:
						System.out.println("Two");
						break;
					case 3: 
						System.out.println("Three");
						break;
					case 4:
						System.out.println("Four");
						break;
					case 5: 
						System.out.println("Five");
						break;
					case 6:
						System.out.println("Six");
						break;
					case 7: 
						System.out.println("Seven");
						break;
					case 8:
						System.out.println("Eight");
						break;
					case 9: 
						System.out.println("Nine");
						break;
					case 0:
						System.out.println("Zero");
						break;
					default:
						break;
					}
					number=number/10;
				}
				for (int i=1; i <= diff; i++) {
					System.out.println("Zero");
				}
			}
		}
	}
	
	public static int getDigitCount(int number) {
		int result=0;
		
		if (number <0) {
			result=-1;
		}else if(number==0) {
			result=1;
		}else {
			while(number>0) {
				result++;
				number=number/10;
			}
		}
		
		return result;
	}
	
	public static int reverse(int number) {
		int result=0;
		
		if (number>-10 & number<10) {
			result=number;
		} else if(number<=-10) {
			number=Math.abs(number);
			while(number>0) {
				result=number%10+result;
				number=number/10;
				if (number>=1) {
					result=result*10;
				} else {
					continue;
				}
			}
			result=0-result;
		} else {
			while(number>0) {
				result=number%10+result;
				number=number/10;
				if (number>=1) {
					result=result*10;
				} else {
					continue;
				}
			}
		}
		return result;
	}
}
