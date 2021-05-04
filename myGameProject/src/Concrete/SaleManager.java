package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {
	
	DiscountManager discountManager;
	
	

	public SaleManager(DiscountManager discountManager) {
		super();
		this.discountManager = discountManager;
	}



	@Override
	public void getUnitPriceAfterDiscount(Game game, Campaign campaign, User user) {
		double result=discountManager.discountPriceCalculation(game.getPrice(), campaign.getDiscount());
		System.out.println("+> "+user.getFirstName()+" "+user.getLastName()+ " '" 
				+ game.getName() + "' oyununu '"
				+ campaign.getName()+"' kampanyasý ile "
				+ game.getPrice() + " TL yerine " 
				+ result +" TL'ye satin aldý.");
	}

}
