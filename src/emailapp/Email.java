package emailapp;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxcapacity=500;
	private int dafaultPasswordlength = 10;
	private String alternateEmail;
	private String companySuffix = "jaycompany.com";
	
	
	//constructor to receive the firstname and lastname
	public Email(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		//System.out.println("Email Created :"+ this.firstname+ " "+this.lastname );
		
		//call a method asking for department. return the department
		this.department = setDepartment();
		//System.out.println("Department :"+ this.department);
		
		// call a method that returns a random password
		this.password= randomPassword(dafaultPasswordlength);
		System.out.println("Your password is :"+ this.password);
		
		// combine elements to generate email
		this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "."+ companySuffix;
		//System.out.println("Your email is : " + email);
	} 
	
	// Asking for department
	private String setDepartment() {
		System.out.print("New worker:"+firstname+". \nDepartment Codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice= in.nextInt();
		if(depChoice==1) { return "sales";}
		else if(depChoice==2){return "dev";}
		else if(depChoice==3){return "acct";}
		else {return "";}
		
	}
	// generate a random password
	private String randomPassword(int length) {
	
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand= (int) (Math.random()*passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxcapacity=capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
		
	}
	
	//Change password
	public void changePassword(String Password) {
		
		this.password= Password;
	}

	public String getPassword() {
		return password;
	}

	public int getMailboxcapacity() {
		return mailboxcapacity;
	}

	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String showInfo() {
		return "DISPLAY NAME : "+ firstname + " " + lastname+ ","+
				"\nCOMPANY EMAIL :" +email + ","+
				"\nMAILBOX CAPACITY : "+ mailboxcapacity + "MB .";
				
	}
	
	
	
}
