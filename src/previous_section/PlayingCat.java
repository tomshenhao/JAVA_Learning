package previous_section;

public class PlayingCat {
	public static boolean isCatPlaying(boolean summer, int temperature) {
		boolean result;
		result=false;
		
		if (summer==false & temperature >=25 & temperature <=35 ) {
			result = true;
		}
		else if (summer==true & temperature >=25 & temperature <=45 ) {
			result = true;
		}
			
		return result;
	}
	
}
