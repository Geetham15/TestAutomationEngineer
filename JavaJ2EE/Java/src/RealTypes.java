
public class RealTypes {

	public static void main(String[] args) {
		//float sal = 2500.75; //Type mismatch: cannot convert from double to float
		//float sal = 2500.75f;
		//float sal = 2500.75F;
		float sal = (float) 2500.75;
		System.out.println("my salary = " + sal);
		
		//double data = 2500.75;
		//double data = 2500.75d;
		double data = 2500.75D;
		System.out.println(data);
		System.out.println(Double.hashCode(2500.75));
	}

}
