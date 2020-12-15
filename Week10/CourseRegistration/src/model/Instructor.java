package model;

public class Instructor {
	private String firstName;
	private String lastName;
	private String email;
	
	public Instructor() {
		
	}
	
	public Instructor(String firstName, String lastName, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
	}
	
	public Instructor(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(makeEmailAddress(firstName, lastName));
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Instructor [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
	public String makeEmailAddress(String firstName, String lastName) {
		char firstInitial = firstName.charAt(0);
		
		String email = firstInitial + lastName + "@dmacc.edu";
		return email.toLowerCase();
	}
	
	
	
	
}
