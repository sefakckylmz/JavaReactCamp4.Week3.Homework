package Concrate;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void register(Game game) {
		System.out.println(game.getGameName()+" Adlý oyun kaydedildi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+" Adlý oyun güncellendi ");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" Adlý oyun silindi");
		
	}

}
