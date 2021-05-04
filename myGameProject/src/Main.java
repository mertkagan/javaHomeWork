import java.time.LocalDate;

import Abstract.CampaignService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		Game fm21 = new Game(1,"Football Manager 2021",249);
		Game gtaV = new Game(2,"Grand Theft Auto 5",200);
		Game csGo = new Game(3,"Counter Strike Global Offensive",108);
		GameManager gameManager = new GameManager();
		
		Campaign campaignSummer = new Campaign();
		campaignSummer.setId(1);
		campaignSummer.setName("Yaz Sezonu indirimi : Tüm Oyunlarda %10 Ýndirim");
		campaignSummer.setDiscount(0.10);
		CampaignService campaignManager = new CampaignManager();
		
		User mert =new User(1,"Mert Kaðan","Aktaþ",LocalDate.of(2000, 07, 19),"12345678901");
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		
		userManager.add(mert);
		
		gameManager.add(fm21);
		gameManager.add(gtaV);
		gameManager.add(csGo);
		
		campaignManager.add(campaignSummer);
		
		DiscountManager discountManager=new DiscountManager();
		SaleManager saleManager=new SaleManager(discountManager);
		saleManager.getUnitPriceAfterDiscount(fm21,campaignSummer, mert);
		
		
		

	
		
		
		

	}

}
