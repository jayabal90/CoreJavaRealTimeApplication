package studentApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
				
		// Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students=new Student[numOfStudents];
		
		//create n number of students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println("--- enrolled details ---");
			
		}
		
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
			
		}
		
		
		
	}

}
