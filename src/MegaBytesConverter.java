
public class MegaBytesConverter {
	public static void printMegaBytesAndKiloBytes (int kiloBytes){
		
		int megaBytes;
		int newkiloBytes; 
		
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		}
		else {
			megaBytes=Math.round(kiloBytes / 1024);
			newkiloBytes=kiloBytes - megaBytes*1024;
			System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+newkiloBytes+" KB");
		}
	}
}
