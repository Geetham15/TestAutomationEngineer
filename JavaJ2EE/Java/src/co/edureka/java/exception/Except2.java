package co.edureka.java.exception;

public class Except2 {

	public static void main(String[] args) {
		String str = "625";
		System.out.println(str + 25); //62525

		int n = Integer.parseInt(str);
		System.out.println(n + 25); //650
		
		str = "A";
		n = Integer.parseInt(str); //java.lang.NumberFormatException
		System.out.println(n);
	}

}
