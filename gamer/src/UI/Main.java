package UI;

import java.util.Scanner;

import Adapters.MernisServiceAdapter;
import Business.Concrete.AuthManager;
import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.OrderManager;
import Business.Concrete.SaleManager;
import Business.Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		AuthManager authManager = new AuthManager();
		GameManager gameManager = new GameManager();
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		CampaignManager campaignManager = new CampaignManager();
		OrderManager orderManager = new OrderManager();
		SaleManager saleManager = new SaleManager(orderManager);
		
		System.out.println("WELCOME TO GAMERCS, please login/register");
		Scanner input = new Scanner(System.in);
					
		System.out.print("Your firstName  ");
		String firstName = input.next();
		System.out.print("Your lastName  ");
		String lastName = input.next();
		System.out.print("Your email  ");
		String email = input.next();
		System.out.print("Your password  ");
		String password = input.next();
		System.out.print("Your Nationality ID  ");
		String nationalityId = input.next();
		
		User user = new User();
		user.setId(1);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setNationalityIdentifier(nationalityId);
	
		authManager.register(user);
		authManager.login(user);
		authManager.logout(user);
		
		Game firstGame = new Game();
		firstGame.setId(1);
		firstGame.setName("Destiny");
		firstGame.setUnitPrice(200);
		gameManager.add(firstGame);
		
		Game secondGame = new Game();
		secondGame.setId(2);
		secondGame.setName("Stardew Valley");
		secondGame.setUnitPrice(150);
		gameManager.add(secondGame);
		
		Game[] games = new Game[] { firstGame, secondGame };
		
		Order order = new Order(1, 2, 1);
		
		Campaign campaign = new Campaign(1,10); 
		campaignManager.add(campaign);
		
		saleManager.buy(user, games, order, campaign);
		
	}

}
