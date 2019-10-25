package previous_section;
public class SpeedConverter {
    // write your code here
    
    public static long toMilesPerHour(double kilometersPerHour){
        
        long toMilesPerHour;
        
        toMilesPerHour = -1;
        
        if(kilometersPerHour >= 0){
        	toMilesPerHour = Math.round(0.621371 * Math.round(kilometersPerHour));
        }
        return toMilesPerHour;
    }

    public static void printConversion(double kilometersPerHour){
        
    	long milesPerHour;
    	
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }
        else {
        	milesPerHour = Math.round(0.621371 * Math.round(kilometersPerHour));
            System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
        }
    }
}

