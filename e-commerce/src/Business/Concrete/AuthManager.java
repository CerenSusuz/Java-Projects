package Business.Concrete;

import java.util.List;

import Business.Abstract.AuthService;
import Business.Abstract.UserService;
import Entities.Concrete.User;

public class AuthManager implements AuthService{

	
    UserService userService;
	
	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@Override
	public void register(User user) {
		if(userService.add(user)) {
			System.out.println( user.getFirstName() + " " + user.getLastName() + " registered");	
			System.out.println("Check your gmail");
		}
		
	}

	@Override
	public void login(User user) {
		List<User> users = userService.getAll();
		
		for (User registeredUSer : users) {
			if (registeredUSer.getPassword().equals(user.getPassword()) && registeredUSer.geteMail().equals(user.geteMail())) {
				System.out.println("Welcome," + " " + user.getFirstName() + " " + user.getLastName());
				break;
			}
		}
		System.out.println("Wrong email and password.");
		
	}

}
