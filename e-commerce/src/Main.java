import Business.Concrete.AuthManager;
import Business.Concrete.UserManager;
import Core.Adapters.GoogleAdapter;
import DataAccess.Concrete.InMemoryUserDao;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		AuthManager authManager = new AuthManager(new UserManager(new InMemoryUserDao()));
        UserManager userManager = new UserManager(new InMemoryUserDao());
		GoogleAdapter googleAdapter = new GoogleAdapter();
		
		System.out.println("---------------+------------------");
		System.out.println("WELCOME LET'S GET SHOPPING!!!!!");
		System.out.println("---------------+------------------");
		
		User user = new User(1, "Ceren", "Susuz", "ceren@ceren.com", "Ceren123");

		System.out.println(userManager.getByEmail(user.geteMail()));
		
		authManager.register(user);
		authManager.login(user);
		
		googleAdapter.login();

	}

}
