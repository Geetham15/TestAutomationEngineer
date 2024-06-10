package while_loops;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();

		int fact = 1;
		int i = 1;
		while ( i <= x)
		{
			fact = fact * i;
			 ++ i;
		}
		
		System.out.println("Factorial of a number is "+ fact);
	}

}
