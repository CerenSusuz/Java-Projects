package Business.Concrete;

import Business.Abstract.UserCheckService;
import Business.Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if (userCheckService.checkIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " added");
		} else {
			System.out.println(user.getNationalityIdentifier() + "not added");
		}
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " deleted");

	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " updated");

	}

}
