package Concrate;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService {

	@Override
	public void gameSale(Player player, Game game) {
		System.out.println(player.getFirstname()+" adlý oyuncu "+game.getGameName()+" adlý oyunu satýn aldý");
		
	}

	@Override
	public void saleWithCampaign(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstname()+" adlý oyuncu "+game.getGameName()+
		" adlý oyunu "+campaign.getCampaignName()+" adlý kampanya ile satýn aldý");
				
	}

}
