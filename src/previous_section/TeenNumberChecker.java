package previous_section;

public class TeenNumberChecker {
	public static boolean hasTeen(int age1, int age2, int age3) {
		boolean result;
		result=false;
		
		if ((age1>=13 && age1<=19)||(age2>=13 && age2<=19)||(age3>=13 && age3<=19)) {
			result=true;
		}
		
		return result;
	}
	
	public static boolean isTeen(int age) {
		boolean result;
		result=false;
		
		if (age>=13 && age<=19) {
			result=true;
		}
		
		return result;
	}
}
