package kodlama.io;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Instructor -> " + user.email + " added");
	}
	
	@Override
	public void login() {
		System.out.println("Hi instructor, login ok");
	}
	
	@Override
	public void logout() {
		System.out.println("Hi instructor, logout ok");
	}
	
	public void getUserList(User[] users) {
		for (User user : users) {
			System.out.println(user.email);
		}
	}
}
