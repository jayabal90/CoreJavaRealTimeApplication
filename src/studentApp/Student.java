package studentApp;

import java.util.Scanner;

public class Student {

	private String firstname;
	private String lastname;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int id =1000;
	
	
	// Constructor : prompt user to enter student's name and year
	
	public Student() {
		super();
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter student first name : ");
		this.firstname=in.nextLine();
		
		System.out.print("Enter student last name : ");
		this.lastname=in.nextLine();
		
		System.out.print("1 - freshmen\n2 - sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear=in.nextInt();
		
		setStudentID();
		System.out.println(firstname +" "+ lastname + " "+ gradeYear+" "+studentID);
		
		
	}
	
	// Generate an Id
	private void setStudentID() {
		id++;
		this.studentID=gradeYear+""+id;
	}
	
	// Enroll in courses
	public void enroll() {
		// get inside loop , user hits 0
		do {
			System.out.print("Enter course to enroll(Q to quit): ");
			Scanner is = new Scanner(System.in);
			String course = is.nextLine();
			if(!course.equalsIgnoreCase("Q")) {
				courses = courses+ "\n "+ course;
				tuitionBalance=tuitionBalance+costOfCourse;
			}else {
				System.out.println("BREAK !");
				break;
			}
		} while(1 !=0);
		//System.out.println("ENROLLED IN: "+courses);
		
	}
	
	// view balance
	public void viewBalance() {
		
		System.out.println("Your balance is: $"+tuitionBalance);
	}
	
	//pay tuition
	public void payTuition(){
		viewBalance();
		System.out.print("Enter your payment :$");
		Scanner s = new Scanner(System.in);
		int payment =s.nextInt();
		tuitionBalance= tuitionBalance - payment;
		System.out.println("Thank you for your payment of : $"+payment);
		
		viewBalance();
	}
	
	//view status
	public String toString() {
		return "Name: "+firstname+ " " + lastname +
				"\nGrade Level :"+gradeYear +
				"\nStudentID: "+studentID+
				"\nCousrses Enrolled: "+ courses +
				"\nBalance : $"+tuitionBalance;
	}
	
	
	
}
