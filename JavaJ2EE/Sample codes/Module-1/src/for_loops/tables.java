package for_loops;

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		int i;
		for (i = 1; i <= 10; ++i)
			System.out.println(x + " * " + i + " = "+i * x);

	}

}
