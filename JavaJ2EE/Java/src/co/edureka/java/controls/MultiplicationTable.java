package co.edureka.java.controls;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("which number's multiplication table? ");
		int num = sc.nextInt();
		printTable(num);

	}

	private static void printTable(int num) {
		for(int i = 1; i<=10; i++) {
			int p = num * i;
			System.out.printf("%2d x %2d = %2d", num, i , p );
			System.out.println();
		}
	}
}
