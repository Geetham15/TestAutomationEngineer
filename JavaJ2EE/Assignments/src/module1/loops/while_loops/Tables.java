package module1.loops.while_loops;

import java.util.Scanner;

//Write a program to generate tables of 10
public class Tables {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number : ");
		int n = sc.nextInt();
		int i = 1;
		while(i<=20) {
			System.out.printf("%2d x %2d = %4d\n", n, i, (n*i));
			i++;
		}
	}

}