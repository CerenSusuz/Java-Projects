package Business.Abstract;

import Entities.User;

public interface UserCheckService {
	public boolean checkIfRealPerson(User user);
}
