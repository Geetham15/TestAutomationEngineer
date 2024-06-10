package module1.loops.for_loops;

import java.util.Scanner;

//Write a program to find factorial ofa number.
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		int n = sc.nextInt();
		int factorial = 1;
		
		for(int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		System.out.printf("Factorial of number %d! is : %d", n, factorial);

	}

}
