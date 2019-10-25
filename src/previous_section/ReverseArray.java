package previous_section;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please input the count of array:" );
		int count=scanner.nextInt();
		scanner.nextLine();
		int[] array=readIntegers(count);
		int[] result=Reverse(array);
		
		System.out.println("Before reverse array:");
		System.out.println(Arrays.toString(array));
		System.out.println("After reverse array:");	
		System.out.println(Arrays.toString(result));
	}

	private static int[] readIntegers(int count) {
		int[] array = new int[count];
		for(int i=0; i<count; i++) {
			System.out.println("Please input the number:");
			array[i]=scanner.nextInt();
			scanner.nextLine();
		}
		
		return array;
	}
	
	private static int[] Reverse(int[] array) {
		int length=array.length;
		int [] result=new int[length];
		
		for(int i=0;i<length;i++) {
			
			result[length-1-i]=array[i];
		}
		
		return result;
	}
	
}
