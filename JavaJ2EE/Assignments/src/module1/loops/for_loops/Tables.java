package module1.loops.for_loops;

import java.util.Scanner;

//Write a program to generate tables of 10
public class Tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to generate a tables : ");
		int tables = sc.nextInt();
		
		for(int i=1; i<=20; i++) {
			System.out.printf("%d X %2d = %3d\n", tables, i, (tables*i));
		}
	}

}
