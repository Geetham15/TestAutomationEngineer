package co.edureka.java.controls;

public class Naturals3 {

	public static void main(String[] args) {
		
		printNaturals(); // method call
		printNaturals(); // method call
		printNaturals(); // method call
	}
	
	/*-- Method definition to display first 10 natural numbers --*/
	static void printNaturals() {
		System.out.println("First 10 Natural Numbers are: ");
		int n = 1;
		while(n<11) {
			if(n==10) {
				System.out.print(n);
			} else {
				System.out.print(n + ", ");
			}
			n=n+1;
		}
	}

}
