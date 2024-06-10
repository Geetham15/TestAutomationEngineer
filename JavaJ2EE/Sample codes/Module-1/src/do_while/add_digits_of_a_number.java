package do_while;

import java.util.Scanner;

public class add_digits_of_a_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		int rem, sum=0;
		
		do
		{
			rem = x % 10;
			sum = sum + rem;
			 x = x / 10;
		}while (x > 0);
		System.out.println("Added digits of a number is "+sum);
	}

}
