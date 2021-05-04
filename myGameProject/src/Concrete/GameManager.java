package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " �simli Oyun Eklendi");
		
	}

	@Override
	public void remove(Game game) {
		System.out.println(game.getName() + " �simli Oyun Silindi");
		
	}

	@Override
	public void uptade(Game game) {
		System.out.println(game.getName() + " �simli Oyun G�ncellendi");
		
	}

}
