package module1.loops.while_loops;

import java.util.Scanner;

//Write a program to reverse the digits of a number.

public class Reverse_digits_of_number{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number to reverse :");
		int n = sc.nextInt();

		int rem, rev = 0;
		
		while(n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		System.out.println("Reverse digit of number is " + rev);

	}

}
