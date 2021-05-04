package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SaleService {
	
	public void getUnitPriceAfterDiscount(Game game, Campaign campaign, User user);

}
