package co.edureka.java.oops;

class A{
	int a=10, b=20;
	void displayAB() {
		System.out.println("In class A - " + a + " | " + b);
	}
}
class B extends A{
	int c=30;
	void displayAB() {
		System.out.println("In class A - " + a + " | " + b);
	}
	void displayABC() {
		System.out.println("In class A- " +a + " | " + b + " | " +c);
	}
}
public class InheritanceTest {

	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.a + " | " + b.b + " | " + b.c);
		b.displayAB();
		b.displayABC();

	}

}
