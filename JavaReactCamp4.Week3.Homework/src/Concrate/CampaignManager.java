package Concrate;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adl� kampanya eklendi");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adl� kampanya silindi");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adl� kampanya g�ncellendi");
		
	}

}
