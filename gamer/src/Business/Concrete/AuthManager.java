package Business.Concrete;

import Business.Abstract.AuthService;
import Business.Abstract.UserService;
import Entities.User;

public class AuthManager implements AuthService {

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + "  login ok");
	}

	@Override
	public void register(User user) {
		System.out.println(user.getFirstName() + "  register ok");
	}

	@Override
	public void logout(User user) {
		System.out.println("EXIT");
	}

}
