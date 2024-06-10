package co.edureka.java.arrays;

public class ArrayCreations {

	public static void main(String[] args) {
		int[] marks = new int[10];
		marks[0] = 95;
		marks[1] = 87;
		System.out.println("size of array = " + marks.length);
		
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i] + "       ");
		}
		System.out.println();
		
		double []salaries = new double[10];
		for(double sal : salaries) {
			System.out.print(sal + "       ");
		}
		System.out.println();
		
		boolean status[] = new boolean[9];
		for(boolean stat : status) {
			System.out.print(stat + "      ");
		}
		System.out.println();
		
		String[] names = new String[12];
		for(String name : names) {
			System.out.print(name + "     ");
		}
	}

}
