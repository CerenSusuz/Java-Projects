package Business.Abstract;

import java.util.List;

import Entities.Concrete.User;

public interface UserService {
	boolean add(User user);
	boolean delete(User user);
	boolean update(User user);
	List<User> getAll();
	User getById(int id);
	User getByEmail(String email);

}
