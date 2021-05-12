package Concrate;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adlý kampanya eklendi");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adlý kampanya silindi");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" Adlý kampanya güncellendi");
		
	}

}
