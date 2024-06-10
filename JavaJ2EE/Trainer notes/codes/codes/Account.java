public class Account {
	long acno;
	String name;
	float bal;
	
	public Account(long acno, String name, float bal) {		
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	
	public void deposit(float amt) {
		this.bal += amt;
		System.out.println("Rs."+amt+ " Credited | Balance: " + this.bal);
	}
	
	public void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal -= amt;
			System.out.println("Rs."+amt+ " Debited | Balance: " + this.bal);
		}else {
			System.err.println("ERROR --> INSUFFICIENT BALANCE!!");
		}
	}
	
	public void getBalance() {
		System.out.printf("A/C No: %10d | NAME: %s | BALANCE: %.2f \n", this.acno, this.name, this.bal);
	}
}
