package Concrate;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void register(Game game) {
		System.out.println(game.getGameName()+" Adl� oyun kaydedildi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" Adl� oyun g�ncellendi ");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" Adl� oyun silindi");
		
	}

}
