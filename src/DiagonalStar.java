
public class DiagonalStar {
	public static void printSquareStar(int number) {
		if(number<5) {
			System.out.println("Invalid Value");
		} else {
			for (int i=1; i<=number; i++) {
				for (int j=1; j<=number; j++) {
					if(j==number) {
						System.out.println("*");
					} else if((i==1)||(i==number)||(j==1)||(i==j)||(j==number-i+1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
		}
	}
}
