package bankacctapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts= new LinkedList<Account>();
		
		String file = "C:\\Users\\Dell\\Desktop\\New BankAccountOpening.csv";
		
		/*
		 * 
		Checking checkacc1 = new Checking("Jayabal Annamalai","312345234",1500);
		
		Savings savings1 = new Savings("Rich Lowe","421345665",2500);
		
		savings1.compound();
		
		savings1.showInfo();
		
		System.out.println("************");
		
		checkacc1.showInfo();
		*/
		
		
//		savings1.deposit(5000);
//		savings1.withdraw(200);
//		savings1.transfer("Investor", 3000);
		
		
		
		// Read a csv file then create new accounts based on the data.
		
		
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
			//System.out.println("NEW ACCOUNT");
			String name =accountHolder[0];
			String ssn=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			// csv data add to new account using LinkedList Data structure
			if(accountType.equals("Savings")) {
				//System.out.println("Open a Savings Account");
				accounts.add(new Savings(name, ssn, initDeposit));
			}else if (accountType.equals("Checking")) {
//				System.out.println("Open a Checking Account");
				accounts.add(new Checking(name, ssn, initDeposit));
			}
			else {
				System.out.println("Error Reading Account Type");
			}
			
			
		}
		
		// Iterate the account data
		//accounts.get(1).showInfo();
		for (Account acc : accounts) {
			System.out.println("\n ****************");
			acc.showInfo();
		}
		

	}

}
