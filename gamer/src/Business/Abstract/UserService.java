package Business.Abstract;

import Entities.User;

public interface UserService {

	public void add(User user);
	public void delete(User user);
	public void update(User user);
}
