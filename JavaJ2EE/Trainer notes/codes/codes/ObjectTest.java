class Employee 
{
	int empno;
	String name;
	float sal;

	void setDetails(){
		name = "Suraj Kumar";
		sal = 5000.5f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}
	/*
	public static void main(String[] args) 
	{
		System.out.println("in Employee class");
	}
	*/
} 

class ObjectTest{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		emp.getDetails();

		emp.empno = 101;
		emp.name = "Suraj";
		emp.sal = 2500f;

		emp.getDetails();
		
		emp.setDetails();
		emp.getDetails();
	}
}
