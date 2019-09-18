
public class MinutesToYearsDaysCalculator {
	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("Invalid Value");
		}
		else {
			
			long xx=minutes;
			long yy=Math.round(xx/60/24/365);
			long zz=Math.round((xx-yy*60*24*365)/24/60);
			
			System.out.println(xx+" min = "+yy+" y and "+zz+" d");
		}
	}
}
