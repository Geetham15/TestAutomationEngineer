package co.edureka.java.operators;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter your name: ");
		//String name = sc.next();
		String name = sc.nextLine();
		
		System.out.println("Hello, " + name);
		System.out.printf("Hello, %s " , name);
	}
}
