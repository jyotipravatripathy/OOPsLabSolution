package Pojo;


public class Employee {
	private String firstName;
	private String lastName;
	private String dept;
	private String email;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
		
	}
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
		
}