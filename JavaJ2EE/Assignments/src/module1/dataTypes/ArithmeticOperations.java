package module1.dataTypes;

import java.util.Scanner;

//Write program to perform all the arithmetic operations
public class ArithmeticOperations {

	public static void main(String[] args) {
		int a = 55;
		int b = 10;
		int c;
		
		System.out.println("Type any one of the operation (+, -, *, /, %, ++, --)");
		Scanner sc = new Scanner(System.in);
		String operator = sc.next();
		
		switch(operator) {
			case "+" :
				c=a+b;
				System.out.println("Adding two numbers: " + c);
				break;
			case "-":
				c= a-b;
				System.out.println("Subtracting two numbers: " + c);
				break;
			case "*" :
				c = a*b;
				System.out.println("Multiply two numbers: " + c);
				break;
			case "/" :
				c =a/b;
				System.out.println("Divide two numbers: " + c);
				break;
			case "%" :
				c=a%b;
				System.out.println("Remainder : " + c);
				break;
			case "++" :
				c = (++a);
				System.out.println("Increment the value a : "+ c);
				break;
			case "--" :
				c = (--a);
				System.out.println("Decrement the value a: " + c);
				break;
			default:
				System.out.println("End of the arithmetic operation");
			
		}

	}

}
