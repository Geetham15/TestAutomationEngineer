package module1.loops.while_loops;

//Write a program to print 10 even numbers and 10 odd numbers
public class Even_and_odd {

	public static void main(String[] args) {
		
		System.out.println("Print 10 odd numbers");
		int i=1;
		while(i<20) {
			System.out.println(i);
			i+=2;
		}

		System.out.println("Print 10 even numbers");
		i=2;
		while(i<20) {
			System.out.println(i);
			i+=2;
		}
		
	}

}
