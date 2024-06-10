package for_loops;

public class even_and_odd {

	public static void main(String[] args) {
		
		int i = 0;
		System.out.println("Even numbers...");
		for (i = 0; i < 20; i = i + 2)
			System.out.println(i);
		
		System.out.println("Odd numbers...");
		for (i = 1; i < 20; i = i + 2)
			System.out.println(i);
	}

}
