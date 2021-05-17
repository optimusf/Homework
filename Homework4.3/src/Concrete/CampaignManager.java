package Concrete;

import Abstracts.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("added campaign : " + campaign.getComment());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("updated campaign : " + campaign.getComment());
		
	}
	

}
