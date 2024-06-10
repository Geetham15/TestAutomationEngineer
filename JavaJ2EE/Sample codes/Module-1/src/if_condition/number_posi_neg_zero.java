package if_condition;

import java.util.Scanner;

public class number_posi_neg_zero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number...");
		int x = sc.nextInt();
		
		if (x < 0)
			System.out.println("Number is negative..");
		else if (x > 0)			
			System.out.println("Number is positive....");
		else
			System.out.println("Number is zero...");

	}

}
