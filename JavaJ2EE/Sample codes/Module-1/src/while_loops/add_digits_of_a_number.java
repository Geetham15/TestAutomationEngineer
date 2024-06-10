package while_loops;

import java.util.Scanner;

public class add_digits_of_a_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		int rem, sum=0;
		
		while (x > 0)
		{
			rem = x % 10;
			sum = sum + rem;
			 x = x / 10;
		}
		System.out.println("Added digits of a number is "+sum);
	}

}
