package Business.Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.User;
import sun.awt.CustomCursor;

public interface SaleService {
	public void buy(User user, Game[] games,Order order, Campaign campaign);
}
