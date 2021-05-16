package Business.Concrete;

import Business.Abstract.OrderService;
import Business.Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.User;

public class SaleManager implements SaleService{
	private OrderService orderService;

	public SaleManager(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void buy(User user, Game[] games, Order order, Campaign campaign) {
		double total = 0.0;
		System.out.println( user.getFirstName() + " " + user.getLastName());
		for (Game game : games) {
			System.out.println(game.getName() + game.getUnitPrice());
			total += game.getUnitPrice();
		}
		System.out.println("Total Price: " + total);
		if (campaign != null) {
			calculate(campaign, total);
		}
		orderService.add(order);
	}
	
	private void calculate(Campaign campaign, double total) {
		System.out.println((total * campaign.getDiscount()/ 100));
	}


}
