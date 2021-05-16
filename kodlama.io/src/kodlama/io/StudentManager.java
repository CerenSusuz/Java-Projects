package kodlama.io;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Student -> " + user.email + " added");
	} 
	
	@Override
	public void login() {
		System.out.println("Hi student,login ok");
	}
	
	@Override
	public void logout() {
		System.out.println("Hi student,logout ok");
	}
	
	public void addComment(int attendanceLevel, String comment) {
		System.out.println("Comment added " + " -> " + "-" + comment + "-" + " and your attendanceLevel -> " + attendanceLevel*1.2);
	}
}
