package co.edureka.java.strings;

public class Employee {
	int empno;
	String name;
	float sal;
	
	public static void main(String[] args) {
		
		// create an instance/object of Employee type
		Employee emp = new Employee();
		
		//accessing the state of object using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//accessing the state of object using reference and method
		emp.getDetails();
		
		//changing the state of instance using reference
		emp.empno = 101;
		emp.name = "geetha";
		emp.sal = 2500f;
		
		emp.getDetails();
		
		//changing the state of object using reference and method
		emp.setDetails();
		emp.getDetails();
	}

	private void setDetails() {

		name = "geetha kumari";
		sal = 5000.5f;
		
	}

	private void getDetails() {
		System.out.println(empno + " | " + name + " | " + sal);
		
	}

}
