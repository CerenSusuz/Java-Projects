package kodlama.io;

public class Student extends User{
	String firstName;
	String lastName;
	int attendanceLevel;
	String comment;
<<<<<<< HEAD
	String firstName;
	String lastName;
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

=======
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
>>>>>>> branch 'main' of https://github.com/CerenSusuz/JavaCamp.git
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public int getAttendanceLevel() {
		return attendanceLevel;
	}

	public void setAttendanceLevel(int attendanceLevel) {
		this.attendanceLevel = attendanceLevel;
	}
}
