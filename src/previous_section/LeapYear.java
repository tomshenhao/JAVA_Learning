package previous_section;
public class LeapYear {
	public static boolean isLeapYear(int year) {
		
		boolean result;
		result=false;
			
		if (year < 1 | year > 9999) {
			result=false;
		}
		else {
			if (year%4==0){
				if (year%100==0) {
					if(year%400==0) {
						result=true; 
					}
				}
			}
		}
				
		return result;
	}
}
