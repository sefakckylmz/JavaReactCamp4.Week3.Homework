package Abstract;

import Entities.Game;


public interface GameService {
	void register(Game game);
	void update(Game game);
	void delete(Game game);
}
