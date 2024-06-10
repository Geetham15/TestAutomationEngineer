package module1.loops.if_condition;

import java.util.Scanner;
//Extend the previous program to check whether the given number is positive, zero or negative.(Hint: use if-else conditions)
public class number_positive_negative_zero {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("Entered number is positive");
		}else if(number < 0){
			System.out.println("Entered number is negative");
		} else {
			System.out.println("Entered number is zero");
		}
	}

}
