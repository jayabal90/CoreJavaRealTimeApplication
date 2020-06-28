package bankacctapp;

public class Savings extends Account {
	
	//List properties specific to a Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	// Constructor to initialize Savings account properties
	public Savings(String name, String ssn,double initDeposit) {
		super(name,ssn,initDeposit);
		accountNumber="1"+accountNumber;
		
		setSafetyDepositBox();
	}
	
	
	private void setSafetyDepositBox() {
		
		safetyDepositBoxID=(int) (Math.random()* Math.pow(10, 3));
		safetyDepositBoxKey =(int) (Math.random()* Math.pow(10, 4));
		
	}
	// List any methods specific to the Savings account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				" Your Savings Account Features "+
			    "\n Safety Deposit Box Id: "+safetyDepositBoxID+
			    "\n Safety Deposit Box Key: "+safetyDepositBoxKey+
			    "\n"
				);
	}


	@Override
	public void setRate() {

		rate=getBaseRate() - .25;
	}
}
