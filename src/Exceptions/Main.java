package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x = getIntEAFP();
		System.out.println("x: "+x);
		
		int a=12;
		int b=0;
		int result=getDividEAFP(a,b);
		System.out.println(result);

	}

	private static int getDividEAFP(int a, int b) {
		try {
			return a/b;
		} catch(ArithmeticException e) {
			return 0;
		}
		
	}

	private static int getIntEAFP() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input an integer");
		try {
			return s.nextInt();
		} catch (InputMismatchException e) {
			return 0;
		}
	}
}
