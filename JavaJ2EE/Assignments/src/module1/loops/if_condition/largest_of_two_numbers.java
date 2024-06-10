package module1.loops.if_condition;

import java.util.Scanner;

public class largest_of_two_numbers {

	public static void main(String[] args) {
		System.out.println("Enter first number : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		int largest;
		largest = (num1>num2)?num1 : num2;
		System.out.printf("Largest of (%d,%d) is : %d", num1, num2, largest);

	}

}
