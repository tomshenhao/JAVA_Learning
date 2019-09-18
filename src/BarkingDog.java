
public class BarkingDog {

	public static boolean shouldWakeUp(boolean baking, int hourOfDay) {
		
		boolean result;
		result = false;		
		
		if (hourOfDay < 0 | hourOfDay > 23) {
			result = false;
		}
		else {
			if (baking) {
				if (hourOfDay < 8 | hourOfDay > 22) {
					result = true;
				}
			}
		}
				
		return result; 
	}
}
