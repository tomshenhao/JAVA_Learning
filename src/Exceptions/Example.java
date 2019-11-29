package Exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
	
	public static void main(String[] args) {
		int result = divide();
		System.out.println(result);
	}

	private static int divide() {
		int x, y;
		try {
			x = getInt();
			y = getInt();
			System.out.println("x is "+x+", y is "+y);
			return x/y;
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException("no suitable input");
		} catch (ArithmeticException e) {
			throw new ArithmeticException("attempt to divided by zero");
		}
		
	}

	private static int getInt() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input an integer");
		while(true) {
			try {
				return s.nextInt();
			} catch (InputMismatchException e) {
				s.nextLine();
				System.out.println("Please input only integer not others");
			}
		}

	}
}
