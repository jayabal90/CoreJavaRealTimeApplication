package bankacctapp;

public abstract class Account implements IBaseRate {

	// List common properties for savings and checking accounts
	private String name;
	private String ssn;
	private double balance;
	static int index = 10000;
	
	protected String accountNumber;
	protected double rate;
	// Constructor to set base properties and initialize the account
	public Account(String name, String ssn, double initDeposit) {
		this.name=name;
		this.ssn=ssn;
		balance=initDeposit;
		//System.out.println("NAME: "+name+ " SSN: "+ssn +" BALANCE: $"+balance);
		
		// set account number
		index++;
		this.accountNumber=setAccountNumber();
		//System.out.println("Account Number "+accountNumber);
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN =ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID=index;
		int randomNumber=(int) (Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN+uniqueID+randomNumber;
		
	}
	//List common methods
	
	public void compound() {
		double accuruedInterest = balance *(rate/100);
		balance= balance+accuruedInterest;
		System.out.println("Accurued Interest: $"+ accuruedInterest);
		printBalance();
	}
	
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance= balance-amount;
		System.out.println("Withdrawing $"+amount);
		printBalance();
	}
	public void transfer(String toWhere,double amount) {
		balance= balance -amount;
		System.out.println("Transfering $"+amount+" to "+toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance is now: $"+balance);
	}
	
	
	public void showInfo() {
		System.out.println(
				"NAME: "+name+
				"\nAccount Number: "+accountNumber+
				"\nBalance: "+balance+
				"\nRate: "+rate+ "%"
				
				);
	}
}
