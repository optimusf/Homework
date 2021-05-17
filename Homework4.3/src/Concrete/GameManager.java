package Concrete;

import Abstracts.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("Added to system : " + game.getName());
	}

	@Override
	public void del(Game game) {
		System.out.println("Deleted to system : " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Updating : " + game.getName());
		
	}

}
