package Entities;


public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String nationalityIdentifier;
	private int getDateOfBirthYear;
	
	public User() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationalityIdentifier() {
		return nationalityIdentifier;
	}

	public void setNationalityIdentifier(String nationalityIdentifier) {
		this.nationalityIdentifier = nationalityIdentifier;
	}

	public int getGetDateOfBirthYear() {
		return getDateOfBirthYear;
	}

	public void setGetDateOfBirthYear(int getDateOfBirthYear) {
		this.getDateOfBirthYear = getDateOfBirthYear;
	}


}