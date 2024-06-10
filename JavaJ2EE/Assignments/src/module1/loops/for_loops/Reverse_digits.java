package module1.loops.for_loops;

import java.util.Scanner;

//Write a program to reverse the digits of a number
public class Reverse_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int n = sc.nextInt();
		int rem;
		String reverse_digit="";
		for(;n > 0; n = n/10) {
			rem = n%10;
			reverse_digit+=rem;			
		}
		System.out.println("Reverse digit of the entered number is "+ reverse_digit);

	}

}
