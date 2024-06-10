package module1.loops.while_loops;

import java.util.Scanner;

//Write a program to find factorial of a number
public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial : ");
		int n = sc.nextInt();
		int i = 1;
		int fact = 1;
		while(i<=n) {
			fact = fact * i;
			i++;
		}
				
		System.out.printf("Factorial of the number %d! is %d" ,n, fact);
	}

}
