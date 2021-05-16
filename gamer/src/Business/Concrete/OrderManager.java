package Business.Concrete;

import Business.Abstract.OrderService;
import Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println(order.getGameId() + " added ok");
		
	}

	@Override
	public void update(Order order) {
		System.out.println(order.getGameId() + " updated ok");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println(order.getGameId() + " deleted ok");
		
	}

}
