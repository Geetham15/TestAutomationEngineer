
public class Test {

	public static void main(String[] args) {
		String str = "abc";
		int hash = str.hashCode();
		System.out.println(hash);
		System.out.println(Integer.valueOf(hash));
		
		double data = 25;
		hash = Double.hashCode(data);
		System.out.println(hash);
		System.out.println(Double.valueOf(hash));
	}
}