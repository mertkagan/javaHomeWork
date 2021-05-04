package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ " �simli Kampanya Olu�turuldu");
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println(campaign.getName()+ " �simli Kampanya Silindi");
		
	}

	@Override
	public void uptade(Campaign campaign) {
		System.out.println(campaign.getName()+ " �simli Kampanya G�ncellendi");
		
	}

}
