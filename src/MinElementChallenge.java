import java.util.Scanner;

public class MinElementChallenge {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int[] readIntegers(int count) {
		int[] array=new int[count];
		for(int i=0;i<array.length; i++) {
			System.out.println("Enter a number:");
			array[i]=scanner.nextInt();
			scanner.nextLine();
		}
		return array;
	}
	
	private static int findMin(int[] array) {
		int result=Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++) {
			if(result>array[i]) {
				result=array[i];
			}
			else {
				continue;
			}
		}		
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter count:");
		int count=scanner.nextInt();
		scanner.nextLine();
		int[] myArray=readIntegers(count);
		int result=findMin(myArray);
		System.out.println("The min number is "+result);

	}

	
	
}
