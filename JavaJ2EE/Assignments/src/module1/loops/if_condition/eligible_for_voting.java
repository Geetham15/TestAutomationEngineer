package module1.loops.if_condition;

import java.util.Scanner;

//Write a program to check if a candidate is eligible for voting or not (Hint: Check age)
public class eligible_for_voting {

	public static void main(String[] args) {
		System.out.println("Enter the candidate age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age<0) {
			System.out.println("Invalid age for the candidate. Please check");
		}else {
			if(age>=18) {
				System.out.println("Candidate is eligible to vote");
			}else {
				System.out.println("Candidate not eligible to vote");
			}
		}
	}

}
