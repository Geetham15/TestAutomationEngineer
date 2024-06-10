package co.edureka.java.strings;

public class StringCreations {
	

	public static void main(String[] args) {
		String s1 = "edureka"; //String literal -> stores in String constant pool
		String s2 = "edureka";
		System.out.println(s1 == s2); //true

		String s3 = new String("Java"); // new Operator stores it in a heap memory
		String s4 = new String("Java");
		System.out.println(s3 == s4); //false - because pointing to two different memeory
	}

}
