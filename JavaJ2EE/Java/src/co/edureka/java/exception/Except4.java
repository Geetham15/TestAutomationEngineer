package co.edureka.java.exception;

//Program to divide a number by another where the numbers are given as command-line arguments
//Run Configurations -> Arguments -> under Program Arguments -> give 10 0
public class Except4 {

	public static void main(String[] args) {
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = x/y;
		    System.out.printf("%d / %d = %d\n", x, y, z);	
		} catch(ArithmeticException ex) { // if the input is divide by 0 i.e 10 0
			System.out.println("Cannot divide an integer by 0");
		} catch(ArrayIndexOutOfBoundsException ex) { //if the input is only one arg 10 or no input
			System.out.println("please provide min 2 cmd-args");
		} catch(NumberFormatException ex) { //if input is A B
			System.out.println("Please provide int type data as cmd args");
		}
			System.out.println("====== done ====="); {
				
			}

	}

}