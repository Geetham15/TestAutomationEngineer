package co.edureka.java.exception;

public class ExceptionPropagation {

	public static void main(String[] args) {
		m1();

	}

	private static void m1() {
		m2();
		
	}

	private static void m2() {
		m3();		
	}

	private static void m3() {
		int x =10;
		int y = 0;
		int z = x/y; //java.lang.ArithmeticException
		System.out.printf("%d / %d = %d\n", x, y, z);
		System.out.println("====== done =====");
		
	}
 //Exception goes back to the caller of the method so m3->m2->m1-> main() This is called exception propogation
 //java executor is having default exception handler
}

