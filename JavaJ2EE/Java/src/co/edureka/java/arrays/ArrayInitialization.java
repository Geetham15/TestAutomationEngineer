package co.edureka.java.arrays;

public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = { 95, 74, 68, 93, 82, 70 };

		System.out.println("No. of subjects = " + marks.length);
		/*  -- array iteration using for loop -- */
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for subject-" + (i+1) + " = " + marks[i]);
		}
		System.out.println();
		
		System.out.println("marks obtained ---> ");
		/* -- array iteration using enhanced for loop -- */
		for(int mark: marks) {
			System.out.print(mark + " | ");
		}
		System.out.println();
		System.out.println(marks[5]); //70
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
