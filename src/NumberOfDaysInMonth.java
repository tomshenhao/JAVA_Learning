
public class NumberOfDaysInMonth {
	public static boolean isLeapYear(int year) {
		
		boolean result=false;
		
		if ((year> 0) && (year<10000) && ((year%4==0 & year%100 != 0)||(year%400==0))){
				result=true;
		}

		return result;
	}
	
	public static int getDaysInMonth(int month, int year) {
		
		int result=0;
		
		if (month <1 | month >12 | year<1 | year > 9999) {
			result=-1;
		}
		
		else {
			boolean year_result=isLeapYear(year);
			
			switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				result=31;
				break;
			case 2:
				if (year_result==true) {
					result=29;
				} else {
					result=28;
				}
				break;
			case 4: case 6: case 9: case 11:
				result=30;
				break;
			}
		}
		return result;
	}
	
}
