package Business.Concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import Business.Abstract.UserService;
import DataAccess.Abstract.UserDao;
import Entities.Concrete.User;

public class UserManager implements UserService {

	//Regex
	public static final String regex = "^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	public Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public boolean add(User user) {
		if((checkUser(user) && checkEMail(user.geteMail()) && checkUserRegistered(user.geteMail()))) {
			userDao.add(user);		
			return true;
		}	
		return false;
	}

	@Override
	public boolean update(User user) {
		userDao.update(user);
		return true;
	}

	@Override
	public boolean delete(User user) {
		userDao.delete(user);
		return true;
		
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
	
	
	//Business Rules
	private boolean checkUser(User user){
		if (checkFirstName(user.getFirstName()) || checkLastName(user.getLastName()) || checkPassword(user.getPassword()) || checkUserRegistered(user.geteMail())) {
			return false;
		}
		return true;
	}
	
	private boolean checkFirstName(String firstName) {
		if(firstName.length() < 2) {
			System.out.println("User's firstName must have at least 2 characters.");
			return false;
		}
		return true;
	}
	
	private boolean checkLastName(String lastName) {
		if(lastName.length() < 2) {
			System.out.println("User's lastName must have at least 2 characters.");
			return false;
		}
		return true;
	}
	
	private boolean checkPassword(String password) {
		if (password.length() < 6){
			System.out.println("Password must have 6 characters.");
			return false;
		}
		return true;		
	}
	
	private boolean checkEMail(String email) {
		if(pattern.matcher(email).find()) {
			return true;
		}
		System.out.println("Invalid e-mail adress.");
		return false;		
	}
	
	private List<String> getEmails(){
		List<User> users = userDao.getAll();
		List<String> emails = new ArrayList<String>();
		for (User user : users) {
			emails.add(user.geteMail());
		}
		return emails;
	}
	
	private boolean checkUserRegistered(String mail) {
		List<String> eMails = this.getEmails();
		for (String eMail : eMails) {
			if (eMail.equals(mail)) {
				System.out.println("This email is registered");
				return false;
			}
		}
		return true;
	}

}
