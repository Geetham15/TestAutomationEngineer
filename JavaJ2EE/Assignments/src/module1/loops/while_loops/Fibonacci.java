package module1.loops.while_loops;

//Write a program to generate 10 Fibonacci numbers
public class Fibonacci {

	public static void main(String[] args) {
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		
		System.out.println(fib1);
		System.out.println(fib2);
		int i=1;
		while(i<=8) {
			fib3 = fib1 + fib2;
			System.out.println(fib3);
			fib1=fib2;
			fib2=fib3;
			i++;
		}

	}

}
