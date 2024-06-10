package module1.loops.while_loops;

import java.util.Scanner;

public class Add_digits_of_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int n = sc.nextInt();

		int rem, sum = 0;
		
		while (n > 0)
		{
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		
		System.out.println("Added digits of a number is "+sum);
		
	}

}
