package Concrate;

import Abstract.GameSaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class GameSaleManager implements GameSaleService {

	@Override
	public void gameSale(Player player, Game game) {
		System.out.println(player.getFirstname()+" adl� oyuncu "+game.getGameName()+" adl� oyunu sat�n ald�");
		
	}

	@Override
	public void saleWithCampaign(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstname()+" adl� oyuncu "+game.getGameName()+
		" adl� oyunu "+campaign.getCampaignName()+" adl� kampanya ile sat�n ald�");
				
	}

}
