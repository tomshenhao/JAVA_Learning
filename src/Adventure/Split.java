package Adventure;

public class Split {

	public static void main(String[] args) {
		
		String[] road = "You are standing at the end of a road before a small brick building".split(" ");
		for (String i: road) {
			System.out.println(i);
		}
		
		System.out.println("===================================================");
		
		String[] building="You are in side a building, a well house for a small spring".split(", ");
		for(String i: building) {
			System.out.println(i);
		}
	}

}
