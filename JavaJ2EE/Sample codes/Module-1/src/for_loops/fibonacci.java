package for_loops;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		int fib1=0;
		int fib2 = 1;
		int fib3;
		System.out.println(fib1);
		System.out.println(fib2);
		
		for (int i = 0; i < 8; ++i)
		{
			fib3 = fib1 + fib2;
			System.out.println(fib3);
			fib1 = fib2;
			fib2 = fib3;
		}
 

	}

}