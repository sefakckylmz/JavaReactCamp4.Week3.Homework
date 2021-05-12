package Concrate;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {
	
	private PlayerCheckService playerCheckService;

	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void register(Player player) {
		if(playerCheckService.checkIfRealPerson(player)) {
			System.out.println(player.getFirstname()+
					" Adlý oyuncu doðrulandý ve kaydý alýndý");
		}else {
			System.out.println("böyle biri yok");
		}
		
	}

	@Override
	public void update(Player player) {
		
		System.out.println(player.getFirstname()+" adlý oyuncu güncellendi");
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstname()+" adlý oyuncu silindi");
		
	}

}
