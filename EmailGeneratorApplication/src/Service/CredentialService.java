package Service;

import java.util.Random;

import Pojo.Employee;



public class CredentialService {
	
	private Employee employee;
	

	public CredentialService(Employee employee) {
		super();
		this.employee = employee;
	}
	public char[] generatePassword() {
		String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*_=+-/.?<>";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password=new char[8];
		for(int i=0;i<8;i++) {
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password;	
	} 
	public void generateEmailAddress() {
		String generatedEmail= employee.getFirstName() + employee.getLastName() + "@" + employee.getDept() + ".gl.com";
		employee.setEmail(generatedEmail);

	}
	public void showCredentials() {
		System.out.println(" Hi  " + employee.getFirstName() +   "  your generated credentials are as follows  " );
		System.out.println("email is:  " +employee.getEmail());
		System.out.println("password is:  " +generatePassword());
	}
}