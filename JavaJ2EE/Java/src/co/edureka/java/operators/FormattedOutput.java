package co.edureka.java.operators;

public class FormattedOutput {

	public static void main(String[] args) {
		float sal = 8750.56429f;
		
		System.out.println(sal); //8750.564
		System.out.printf("%f \n", sal);//8750.564453
		System.out.printf("%.0f \n", sal);//8751 
		System.out.printf("%.1f \n", sal);//8750.6
		System.out.printf("%.2f \n", sal);//8750.56 
		System.out.printf("%.3f \n", sal);//8750.564
		System.out.printf("%.4f \n", sal);//8750.5645
		System.out.printf("%.5f \n", sal);//8750.56445 
	}

}
