package Business.Concrete;

import Business.Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getDiscount() + " added");
		
	}
	
	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getDiscount() + " deleted");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDiscount() + " updated");
		
	}



}
