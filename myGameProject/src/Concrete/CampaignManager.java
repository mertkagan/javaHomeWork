package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+ " Ýsimli Kampanya Oluþturuldu");
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println(campaign.getName()+ " Ýsimli Kampanya Silindi");
		
	}

	@Override
	public void uptade(Campaign campaign) {
		System.out.println(campaign.getName()+ " Ýsimli Kampanya Güncellendi");
		
	}

}
