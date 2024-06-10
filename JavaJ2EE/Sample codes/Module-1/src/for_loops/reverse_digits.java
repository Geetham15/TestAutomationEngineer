package for_loops;

import java.util.Scanner;

public class reverse_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		int rem, rev=0;
		
		for (;x > 0; x = x / 10)
		{
			rem = x % 10;
			rev = rev * 10 + rem;
			 
		}
		System.out.println("Reversed number is "+rev);

	}

}
