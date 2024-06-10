package co.edureka.java.exception;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first no: ");
			int x = sc.nextInt();
			
			System.out.println("Enter second no: ");
			int y = sc.nextInt();
			
			int z = x/y;
			System.out.printf("%d / %d = %d\n", x, y, z);
		} catch(ArithmeticException ex) {
			System.err.println("catch block");
		} finally { //clean up code in finally block
			System.out.println("---- finally block ----");
			System.out.println("application designed and developed by");
			System.out.println("team @ edureka");
			sc.close();
		}
		System.out.println("---- done ----");

	}

}

// If the input is 10 and a -> java.util.InputMismatchException will occur