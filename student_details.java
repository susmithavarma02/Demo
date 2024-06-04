import java.io.*;
import java.util.Scanner;
class student_details{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student details");
		
		String first_name = sc.nextLine();
		String last_name = sc.nextLine();
		String roll_no = sc.nextLine();
		int age = sc.nextInt();
		String gender = sc.nextLine();
		String phone_no = sc.nextLine();
		String email = sc.nextLine();
		
		System.out.println("Student Details: ");
		System.out.println("First Name :" + first_name);
		System.out.println("Last Name :" + last_name);
		System.out.println("Roll No :" + roll_no);
		System.out.println("Age :" + age);
		//System.out.println("Gender :" + gender);
		System.out.println("Phone number :" + phone_no);
		System.out.println("Email :" + email);
	}
}
		
