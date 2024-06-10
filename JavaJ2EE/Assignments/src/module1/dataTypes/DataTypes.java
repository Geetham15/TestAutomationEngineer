package module1.dataTypes;

//Write programs to use all the data types and arithmetic operations
public class DataTypes {
	
	/*
	 * 
	 * Primitive -> Boolean, Numeric
	 * Numeric -> Character and Integral
	 * Character -> char
	 * Integral -> Integer and Floating-point
	 * Integer -> byte, short, int, long
	 * Floating-point -> float, double
	 */

	public static void main(String[] args) {
		int a = 1, b = 2;
		float d=1.2f, e=2.2f;
		short g=2;
		double i=2.2, j=3.3;
		long l=45L, m= 21L;
		byte o=2;
		
		int c = a+b;
		System.out.println("Adding two integers : " + c);
		
		float f = e-d;
		System.out.println("Subtracting two float :" + f);
		
		short h = ++g;
		System.out.println("Increment the short value : " + h);
		
		double k = i*j;
		System.out.println("Multiplication of two double value: " + k);
		
		long n = l/m;
		System.out.println("Divide two long values: " + n);
		
		byte p = (--o);
		System.out.println("Decrement the byte value " + p);

	}

}
