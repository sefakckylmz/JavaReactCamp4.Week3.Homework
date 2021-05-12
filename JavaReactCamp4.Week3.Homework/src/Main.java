

import java.util.Date;

import Adapters.MerniceServiceAdapter;
import Concrate.CampaignManager;
import Concrate.GameManager;
import Concrate.GameSaleManager;
import Concrate.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
	PlayerManager playerManager = new PlayerManager(new MerniceServiceAdapter());
		playerManager.register(new Player(1, "Ethem Sefa", "KÜÇÜKYILMAZ", new Date(2001,3,4), "6666666"));
		playerManager.update(new Player(1, "Ethem Sefa", "KÜÇÜKYILMAZ", new Date(2001,3,4), "6666666"));		
		playerManager.delete(new Player(1, "Ethem Sefa", "KÜÇÜKYILMAZ", new Date(2001,3,4), "6666666"));
		
		System.out.println("---------------------------------");
	
	GameManager gameManager = new GameManager();
		gameManager.register(new Game(1, "VALORANT", 10));
		gameManager.update(new Game(1, "VALORANT", 10));
		gameManager.delete(new Game(1, "VALORANT", 10));
		
		System.out.println("---------------------------------");
		
	CampaignManager campaignManager = new CampaignManager();
	campaignManager.newCampaign(new Campaign(1, "BlackFriday", 70));
	campaignManager.updateCampaign(new Campaign(1, "BlackFriday", 70));
	campaignManager.deleteCampaign(new Campaign(1, "BlackFriday", 70));
	
		System.out.println("---------------------------------");
		
	GameSaleManager gameSaleManager = new GameSaleManager();
	gameSaleManager.gameSale(new Player(1, "Ethem Sefa", "KÜÇÜKYILMAZ", new Date(2001,3,4), "6666666"), new Game(1, "VALORANT", 10));
	gameSaleManager.saleWithCampaign(new Player(1, "Ethem Sefa", "KÜÇÜKYILMAZ", new Date(2001,3,4), "6666666"),new Game(1, "VALORANT", 10),new Campaign(1, "BlackFriday", 70));
	}

}
