package Business.Abstract;

import Entities.User;

public interface AuthService {
	void login(User user);
	void register(User user);
	void logout(User user);
}
