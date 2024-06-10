package co.edureka.java.operators;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first no: ");		
		int x = sc.nextInt();
		
		System.out.print("enter second no: ");
		int y = sc.nextInt();
		
		int lar;
		if( x > y) {
			lar = x;
		}
		else {
			lar = y;
		}
		
		System.out.println("largest of (" + x + ", " + y + ") = " + lar);
		System.out.printf("largest of (%d, %d) = %d", x, y, lar);
	}
}
