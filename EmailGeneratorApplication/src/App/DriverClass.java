package App;

import java.util.Scanner;
import Pojo.Employee;
import Service.CredentialService;

public class DriverClass {  //show menu
	public static void main(String args[]) {

		Scanner scfirstName =new Scanner(System.in);
		System.out.println("Please enter your firstname");
		String firstName = scfirstName.nextLine();

		Scanner sclastName =new Scanner(System.in);
		System.out.println("Please enter your Lastname");
		String lastName = sclastName.nextLine();

		Employee employee1 = new Employee(firstName,lastName);
//		String generatedEmail;
		char[] generatedPassword;
		CredentialService cService= new CredentialService(employee1);
		Scanner scan =new Scanner(System.in);
		int choice;

		System.out.println("Please select the department from the following as 1 or 2 or 3 or 4");
		System.out.println("1. Technical Dept.");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal Dept.");

		choice=scan.nextInt();
		String dept="";
		switch(choice)
		{
		case 1:
		dept = "Tech";
		employee1.setDept("Tech");
		cService.generateEmailAddress();
		generatedPassword = cService.generatePassword();	
		break;
		
		case 2:
		dept = "Admin";
		employee1.setDept("Admin");
		cService.generateEmailAddress();
		generatedPassword= cService.generatePassword();	
		break;
		
		case 3:
		dept = "HR";
		employee1.setDept("HR");
		cService.generateEmailAddress();
		generatedPassword= cService.generatePassword();	
		break;
			
		case 4:
		dept = "Legal";
		employee1.setDept("Legal");
		cService.generateEmailAddress();
		generatedPassword= cService.generatePassword();	
		break;
		
		}
		cService.showCredentials();
		
		
//		if(choice==1) {
//			employee1.setDept("Tech");
//			cService.generateEmailAddress();
//			generatedPassword= cService.generatePassword();	
//		}
//		else if(choice==2) {
//			employee1.setDept("Admin");
//			cService.generateEmailAddress();
//			generatedPassword= cService.generatePassword();
//		}
//		else if(choice==3) {
//			employee1.setDept("HR");
//			cService.generateEmailAddress();
//			generatedPassword= cService.generatePassword();
//		}
//		else if(choice==4) {
//			employee1.setDept("Legal");
//			cService.generateEmailAddress();
//			generatedPassword= cService.generatePassword();
//		}
//	
//		else 
//			System.out.println("enter a valid choice");
//		cService.showCredentials();
	}
}