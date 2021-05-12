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
					" Adl� oyuncu do�ruland� ve kayd� al�nd�");
		}else {
			System.out.println("b�yle biri yok");
		}
		
	}

	@Override
	public void update(Player player) {
		
		System.out.println(player.getFirstname()+" adl� oyuncu g�ncellendi");
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstname()+" adl� oyuncu silindi");
		
	}

}
