package module1.loops.for_loops;

import java.util.Scanner;

//Write a program to add the digits of a number
public class Add_digits_of_a_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		int sum = 0, rem=0;
		for(; n > 0; n = n/10) {
			rem = n % 10;
			sum = sum + rem;
		}
		System.out.printf("Added digits of a number is %d", sum );
	}

}
