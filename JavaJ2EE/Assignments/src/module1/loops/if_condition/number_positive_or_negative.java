package module1.loops.if_condition;

import java.util.Scanner;
//Write a program to check if the number is positive or negative.
public class number_positive_or_negative {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("Entered number is positive");
		}else if(number < 0){
			System.out.println("Entered number is negative");
		}

	}

}
